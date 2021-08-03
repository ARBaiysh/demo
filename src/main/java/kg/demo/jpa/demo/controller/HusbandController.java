package kg.demo.jpa.demo.controller;

import kg.demo.jpa.demo.dto.HusbandDTO;
import kg.demo.jpa.demo.service.HusbandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/husband")
@RequiredArgsConstructor
public class HusbandController {
    private final HusbandService husbandService;

    @GetMapping()
    public List<HusbandDTO> getHusband(){
        return husbandService.getAllHusbands();
    }
}
