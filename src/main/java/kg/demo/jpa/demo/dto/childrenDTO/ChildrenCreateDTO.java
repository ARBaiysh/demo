package kg.demo.jpa.demo.dto.childrenDTO;

import kg.demo.jpa.demo.dto.DTOEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ChildrenCreateDTO implements DTOEntity {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String age;
}
