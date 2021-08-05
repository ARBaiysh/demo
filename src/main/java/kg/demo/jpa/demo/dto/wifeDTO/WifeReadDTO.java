package kg.demo.jpa.demo.dto.wifeDTO;


import kg.demo.jpa.demo.dto.DTOEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class WifeReadDTO implements DTOEntity {
    private String id;
    private String name;
    private String age;
    private String husband;
    private List<String> children;
}
