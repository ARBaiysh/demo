package kg.demo.jpa.demo.dto;

import kg.demo.jpa.demo.entity.Children;
import kg.demo.jpa.demo.entity.Wife;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class HusbandUpdateDTO implements DTOEntity {
    private Long id;
    private String name;
    private int age;
    private Wife wife;
    private Set<Children> children;
}
