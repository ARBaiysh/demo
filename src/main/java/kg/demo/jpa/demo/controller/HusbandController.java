package kg.demo.jpa.demo.controller;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.husbandDTO.HusbandCreateDTO;
import kg.demo.jpa.demo.dto.husbandDTO.HusbandUpdateDTO;
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

    @GetMapping()
    public List<DTOEntity> read() {
        return husbandService.readHusbands();
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody HusbandCreateDTO husbandCreateDTO) {
        husbandService.createHusband(husbandCreateDTO);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@Valid @RequestBody HusbandUpdateDTO husbandUpdateDTO) {
        return new ResponseEntity<>(husbandService.updateHusband(husbandUpdateDTO), HttpStatus.OK);
    }


}
