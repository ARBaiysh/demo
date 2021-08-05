package kg.demo.jpa.demo.controller;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.wifeDTO.WifeCreateDTO;
import kg.demo.jpa.demo.service.WifeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/wife")
@RequiredArgsConstructor
public class WifeController {
    private final WifeService wifeService;

    @GetMapping()
    public List<DTOEntity> read() {
        return wifeService.readHusbands();
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody WifeCreateDTO wifeCreateDTO) {
        wifeService.createWife(wifeCreateDTO);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
