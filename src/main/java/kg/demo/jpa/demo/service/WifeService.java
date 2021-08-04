package kg.demo.jpa.demo.service;

import kg.demo.jpa.demo.entity.Wife;
import kg.demo.jpa.demo.repository.WifeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class WifeService {
//    private final WifeRepository wifeRepository;
//    ;
//
//    public WifeDTO getWifeById(String id) {
//        Wife wife = wifeRepository.findById(Long.parseLong(id)).get();
//
//        return WifeDTO.wifeToWifeDTO(wife);
//    }
//
//    public List<WifeDTO> getAllWife() {
//        List<Wife> wifeList = wifeRepository.findAll();
//        List<WifeDTO> wifeDTOS = new ArrayList<>();
//        wifeList.forEach(wife -> wifeDTOS.add(WifeDTO.wifeToWifeDTO(wife)));
//        return wifeDTOS;
//    }
}
