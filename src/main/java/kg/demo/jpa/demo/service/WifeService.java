package kg.demo.jpa.demo.service;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.wifeDTO.WifeCreateDTO;
import kg.demo.jpa.demo.dto.wifeDTO.WifeReadDTO;
import kg.demo.jpa.demo.entity.Wife;
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
public class WifeService {
    private final WifeRepository wifeRepository;

    public void createWife(WifeCreateDTO wifeCreateDTO) {
        Wife wife = (Wife) new DtoUtils().convertToEntity(new Wife(), wifeCreateDTO);
        wifeRepository.save(wife);
    }

    public List<DTOEntity> readHusbands() {
        List<Wife> all = wifeRepository.findAll();

        List<DTOEntity> dtoEntities = new ArrayList<>();
        all.forEach(wife -> dtoEntities.add(new DtoUtils().convertToDto(wife, new WifeReadDTO())));

        return dtoEntities;
    }
}
