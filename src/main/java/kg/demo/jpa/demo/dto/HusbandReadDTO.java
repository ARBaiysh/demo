package kg.demo.jpa.demo.dto;

import kg.demo.jpa.demo.entity.Children;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class HusbandReadDTO implements DTOEntity {
    private Long id;
    private String name;
    private int age;

    private WifeReadDTO wifeReadDTO;

    private Set<Children> children;
}
