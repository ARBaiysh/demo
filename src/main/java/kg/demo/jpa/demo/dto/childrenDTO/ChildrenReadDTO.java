package kg.demo.jpa.demo.dto.childrenDTO;


import kg.demo.jpa.demo.dto.DTOEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChildrenReadDTO implements DTOEntity {
    private String id;
    private String name;
    private String age;
    private String husband;
    private String wife;
}
