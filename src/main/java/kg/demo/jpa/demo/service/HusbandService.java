package kg.demo.jpa.demo.service;

import kg.demo.jpa.demo.dto.HusbandDTO;
import kg.demo.jpa.demo.entity.Husband;
import kg.demo.jpa.demo.repository.HusbandRepository;
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

    public HusbandDTO getHusbandById(String id) {
        Husband husband = husbandRepository.findById(Long.parseLong(id)).get();

        return HusbandDTO.husbandToHusbandDTO(husband);
    }

    public List<HusbandDTO> getAllHusbands() {
        List<Husband> husbandList = husbandRepository.findAll();
        List<HusbandDTO> husbandDTOS = new ArrayList<>();
        husbandList.forEach(husband -> husbandDTOS.add(HusbandDTO.husbandToHusbandDTO(husband)));
        return husbandDTOS;
    }
}
