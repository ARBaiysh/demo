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
@ToString(exclude = {"husband", "children"})
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @OneToOne(mappedBy = "wife", cascade = {DETACH, MERGE, PERSIST, REFRESH})
    @EqualsAndHashCode.Exclude
    private Husband husband;

    @OneToMany(mappedBy = "wife", cascade = {DETACH, MERGE, PERSIST, REFRESH}, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    private Set<Children> children = new HashSet<>();

    public void addChildren(Children children) {
        this.children.add(children);
        children.setWife(this);
    }
}
