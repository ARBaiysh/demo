package kg.demo.jpa.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.*;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"wife", "children"})
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @OneToOne(cascade = {DETACH, MERGE, PERSIST, REFRESH})
    @EqualsAndHashCode.Exclude
    private Wife wife;

    @OneToMany(mappedBy = "husband", cascade = {DETACH, MERGE, PERSIST, REFRESH}, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    private Set<Children> children = new HashSet<>();

}
