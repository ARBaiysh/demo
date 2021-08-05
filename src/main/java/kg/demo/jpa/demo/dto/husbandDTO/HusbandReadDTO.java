package kg.demo.jpa.demo.dto.husbandDTO;

import kg.demo.jpa.demo.dto.DTOEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class HusbandReadDTO implements DTOEntity {
    private String id;
    private String name;
    private String age;
    private String wife;
    private List<String> children;
}
