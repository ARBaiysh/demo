package kg.demo.jpa.demo.dto;

import kg.demo.jpa.demo.entity.Wife;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
public class WifeDTO {

    private Long id;
    private String name;
    private int age;
    private String husbandDetails;
    private Set<String> setChildrenDetails;

    public static WifeDTO wifeToWifeDTO(Wife wife) {
        WifeDTO wifeDTO = new WifeDTO();
        wifeDTO.setAge(wife.getAge());
        wifeDTO.setName(wife.getName());
        wifeDTO.setId(wife.getId());
        wifeDTO.setHusbandDetails(wife.getHusband().getId() + " : " + wife.getHusband().getName());
        Set<String> childrenDTOS = new HashSet<>();
        wife.getChildren().forEach(children -> childrenDTOS.add(children.getId()+": " + children.getName()));
        wifeDTO.setSetChildrenDetails(childrenDTOS);

        return wifeDTO;
    }

}
