package kg.demo.jpa.demo.dto;

import kg.demo.jpa.demo.entity.Husband;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class HusbandDTO {
    private Long id;
    private String name;
    private int age;
    private String wifeDetails;
    private Set<String> setChildrenDetails;

    public static HusbandDTO husbandToHusbandDTO(Husband husband) {
        HusbandDTO husbandDTO = new HusbandDTO();
        husbandDTO.setAge(husband.getAge());
        husbandDTO.setId(husband.getId());
        husbandDTO.setName(husband.getName());
        husbandDTO.setWifeDetails(husband.getWife().getId() + " : " + husband.getWife().getName());
        Set<String> childrenDTOS = new HashSet<>();
        husband.getChildren().forEach(children -> childrenDTOS.add(children.getId() + " : " + children.getName()));
        husbandDTO.setSetChildrenDetails(childrenDTOS);
        return husbandDTO;
    }
}
