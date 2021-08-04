package kg.demo.jpa.demo.service;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.HusbandCreateDTO;
import kg.demo.jpa.demo.dto.HusbandReadDTO;
import kg.demo.jpa.demo.entity.Husband;
import kg.demo.jpa.demo.repository.HusbandRepository;
import kg.demo.jpa.demo.utils.DtoUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor

public class HusbandService {
    private final HusbandRepository husbandRepository;

    public void createHusband(HusbandCreateDTO husbandCreateDTO) {
        Husband husband = (Husband) new DtoUtils().convertToEntity(new Husband(), husbandCreateDTO);
        husbandRepository.save(husband);
    }

    public List<DTOEntity> readHusbands() {
        List<DTOEntity> dtoEntities = new ArrayList<>();
        List<Husband> all = husbandRepository.findAll();
        for (Husband husband : all){
            dtoEntities.add(new DtoUtils().convertToDto(husband, new HusbandReadDTO()));
        }

            return dtoEntities;

    }
}
