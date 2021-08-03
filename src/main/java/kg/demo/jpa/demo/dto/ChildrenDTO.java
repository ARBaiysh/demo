package kg.demo.jpa.demo.dto;

import kg.demo.jpa.demo.entity.Children;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ChildrenDTO {

    private Long id;
    private String name;
    private int age;
    private String husbandDetails;
    private String wifeDetails;

    public static ChildrenDTO childrenToChildrenDTO(Children children) {
        ChildrenDTO childrenDTO = new ChildrenDTO();
        childrenDTO.setId(children.getId());
        childrenDTO.setName(children.getName());
        childrenDTO.setAge(children.getAge());
        childrenDTO.setHusbandDetails(children.getHusband().getId() + " : " + children.getHusband().getName());
        childrenDTO.setWifeDetails(children.getWife().getId() + " : " + children.getWife().getName());
        return childrenDTO;
    }

}
