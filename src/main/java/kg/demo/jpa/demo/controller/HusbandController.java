package kg.demo.jpa.demo.controller;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.HusbandCreateDTO;
import kg.demo.jpa.demo.service.HusbandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/husband")
@RequiredArgsConstructor
public class HusbandController {
    private final HusbandService husbandService;

    @PostMapping("/create")
    public ResponseEntity<?> createPost(@Valid @RequestBody HusbandCreateDTO husbandCreateDTO) {
        husbandService.createHusband(husbandCreateDTO);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
    @GetMapping("/list")
    public List<DTOEntity> readUser() {
        return husbandService.readHusbands();
    }
}
