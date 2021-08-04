package kg.demo.jpa.demo.service;

import kg.demo.jpa.demo.entity.Children;
import kg.demo.jpa.demo.repository.ChildrenRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ChildrenService {
   private final ChildrenRepository childrenRepository;

//    public ChildrenDTO getChildrenById(String id) {
//        Children children = childrenRepository.findById(Long.parseLong(id)).get();
//
//        return ChildrenDTO.childrenToChildrenDTO(children);
//    }
//
//    public List<ChildrenDTO> getAllChildren() {
//        List<Children> childrenList = childrenRepository.findAll();
//        List<ChildrenDTO> childrenDTOS = new ArrayList<>();
//        childrenList.forEach(children -> childrenDTOS.add(ChildrenDTO.childrenToChildrenDTO(children)));
//        return childrenDTOS;
//    }
}
