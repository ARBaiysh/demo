package kg.demo.jpa.demo.controller;

import kg.demo.jpa.demo.service.ChildrenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/children")
@RequiredArgsConstructor
public class ChildrenController {
    private final ChildrenService childrenService;


//    @GetMapping()
//    public List<ChildrenDTO> getHusband(){
//        return childrenService.getAllChildren();
//    }
//
//
//    @GetMapping("{id}")
//    public ChildrenDTO getHusband(@PathVariable String id){
//        return childrenService.getChildrenById(id);
//    }
}
