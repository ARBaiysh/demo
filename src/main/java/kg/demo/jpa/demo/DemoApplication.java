package kg.demo.jpa.demo;

import kg.demo.jpa.demo.entity.Children;
import kg.demo.jpa.demo.entity.Husband;
import kg.demo.jpa.demo.entity.Wife;
import kg.demo.jpa.demo.repository.ChildrenRepository;
import kg.demo.jpa.demo.repository.HusbandRepository;
import kg.demo.jpa.demo.repository.WifeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

import static java.util.Arrays.*;


@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {
    private final HusbandRepository husbandRepository;
    private final WifeRepository wifeRepository;
    private final ChildrenRepository childrenRepository;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(String... args) {
        Husband father = Husband.builder().name("Father").age(40).build();
        Wife mother = Wife.builder().name("Mother").age(40).build();
        father.setWife(mother);
        mother.setHusband(father);

        Children daughter1 = Children.builder().name("Daughter1").age(15).husband(father).wife(mother).build();
        Children daughter2 = Children.builder().name("Daughter2").age(13).husband(father).wife(mother).build();
        Children son = Children.builder().name("Son").age(7).husband(father).wife(mother).build();

        father.setChildren(Set.of(daughter1, daughter2, son));
        mother.setChildren(Set.of(daughter1, daughter2, son));

        husbandRepository.save(father);
        wifeRepository.save(mother);
        childrenRepository.saveAll(asList(daughter1, daughter2, son));
    }
}
