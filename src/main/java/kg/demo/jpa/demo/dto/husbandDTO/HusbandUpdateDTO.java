package kg.demo.jpa.demo.dto.husbandDTO;

import kg.demo.jpa.demo.dto.DTOEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class HusbandUpdateDTO implements DTOEntity {
    private Long id;
    private String name;
    private int age;
    private Long wifeId;
    private Long childrenId;
}
