package kg.demo.jpa.demo.controller;

import kg.demo.jpa.demo.service.WifeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wife")
@RequiredArgsConstructor
public class WifeController {
    private final WifeService wifeService;


//    @GetMapping()
//    public List<WifeDTO> getHusband(){
//        return wifeService.getAllWife();
//    }
}
