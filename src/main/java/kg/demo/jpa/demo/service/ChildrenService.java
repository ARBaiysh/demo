package kg.demo.jpa.demo.service;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.childrenDTO.ChildrenCreateDTO;
import kg.demo.jpa.demo.dto.childrenDTO.ChildrenReadDTO;
import kg.demo.jpa.demo.dto.childrenDTO.ChildrenUpdateDTO;
import kg.demo.jpa.demo.entity.Children;
import kg.demo.jpa.demo.repository.ChildrenRepository;
import kg.demo.jpa.demo.repository.WifeRepository;
import kg.demo.jpa.demo.utils.DtoUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ChildrenService {
    private final ChildrenRepository childrenRepository;

    public void createChildren(ChildrenCreateDTO childrenCreateDTO) {
        Children children = (Children) new DtoUtils().convertToEntity(new Children(), childrenCreateDTO);
        childrenRepository.save(children);
    }

    public List<DTOEntity> readChildren() {
        List<DTOEntity> dtoEntities = new ArrayList<>();

        List<Children> all = childrenRepository.findAll();
        all.forEach(children -> dtoEntities.add(new DtoUtils().convertToDto(children, new ChildrenReadDTO())));

        return dtoEntities;
    }
}
