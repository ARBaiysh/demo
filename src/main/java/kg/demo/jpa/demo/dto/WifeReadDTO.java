package kg.demo.jpa.demo.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WifeReadDTO implements DTOEntity {
    private Long id;
    private String name;
    private int age;
    private HusbandReadDTO husbandReadDTO;
}
