package kg.demo.jpa.demo.service;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.husbandDTO.HusbandCreateDTO;
import kg.demo.jpa.demo.dto.husbandDTO.HusbandReadDTO;
import kg.demo.jpa.demo.dto.husbandDTO.HusbandUpdateDTO;
import kg.demo.jpa.demo.entity.Children;
import kg.demo.jpa.demo.entity.Husband;
import kg.demo.jpa.demo.entity.Wife;
import kg.demo.jpa.demo.repository.ChildrenRepository;
import kg.demo.jpa.demo.repository.HusbandRepository;
import kg.demo.jpa.demo.repository.WifeRepository;
import kg.demo.jpa.demo.utils.DtoUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
@RequiredArgsConstructor

public class HusbandService {
    private final HusbandRepository husbandRepository;
    private final WifeRepository wifeRepository;
    private final ChildrenRepository childrenRepository;

    public void createHusband(HusbandCreateDTO husbandCreateDTO) {
        Husband husband = (Husband) new DtoUtils().convertToEntity(new Husband(), husbandCreateDTO);
        husbandRepository.save(husband);
    }

    public List<DTOEntity> readHusbands() {
        List<Husband> all = husbandRepository.findAll();

        List<DTOEntity> dtoEntities = new ArrayList<>();
        all.forEach(husband -> dtoEntities.add(new DtoUtils().convertToDto(husband, new HusbandReadDTO())));

        return dtoEntities;
    }

    public DTOEntity updateHusband(HusbandUpdateDTO husbandUpdateDTO) {
        Wife wife = null;
        Children children = null;
        if (wifeRepository.existsWifeById(husbandUpdateDTO.getWifeId())) {
            wife = wifeRepository.findById(husbandUpdateDTO.getWifeId()).get();
        }
        if (childrenRepository.existsChildrenById(husbandUpdateDTO.getChildrenId())) {
            children = childrenRepository.findById(husbandUpdateDTO.getChildrenId()).get();
        }
        Husband husband = husbandRepository.findById(husbandUpdateDTO.getId()).get();
        husband.setName(husbandUpdateDTO.getName());
        husband.setAge(husbandUpdateDTO.getAge());
        husband.setWife(wife != null ? wife : husband.getWife());
        husband.getChildren().add(children);

        husbandRepository.save(husband);
        if (children != null) childrenRepository.save(children);

        return new DtoUtils().convertToDto(husbandRepository.findById(husbandUpdateDTO.getId()).get(), new HusbandReadDTO());
    }
}
