package kg.demo.jpa.demo.dto.childrenDTO;


import kg.demo.jpa.demo.dto.DTOEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChildrenUpdateDTO implements DTOEntity {
    private Long id;
    private String name;
    private int age;
    private Long husbandId;
    private Long wifeId;
}
