package kg.demo.jpa.demo.entity;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @ManyToOne()
    @EqualsAndHashCode.Exclude
    private Husband husband;

    @ManyToOne()
    @EqualsAndHashCode.Exclude
    private Wife wife;


}
