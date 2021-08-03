package kg.demo.jpa.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "wife_id")
    @EqualsAndHashCode.Exclude
    private Wife wife;

    @OneToMany(mappedBy = "wife",
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH},
            orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    private Set<Children> children = new HashSet<>();


}
