package kg.demo.jpa.demo.dto.wifeDTO;


import kg.demo.jpa.demo.dto.DTOEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class WifeUpdateDTO implements DTOEntity {
    private Long id;
    private String name;
    private int age;
    private Long husbandId;
    private Long childrenId;
}
