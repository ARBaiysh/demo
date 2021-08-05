package kg.demo.jpa.demo.controller;

import kg.demo.jpa.demo.dto.DTOEntity;
import kg.demo.jpa.demo.dto.childrenDTO.ChildrenCreateDTO;
import kg.demo.jpa.demo.service.ChildrenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/children")
@RequiredArgsConstructor
public class ChildrenController {
    private final ChildrenService childrenService;

    @GetMapping()
    public List<DTOEntity> read() {
        return childrenService.readChildren();
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody ChildrenCreateDTO childrenCreateDTO) {
        childrenService.createChildren(childrenCreateDTO);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
