package kg.demo.jpa.demo.repository;

import kg.demo.jpa.demo.entity.Husband;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HusbandRepository extends JpaRepository<Husband, Long> {
    Optional<Husband> getByName(String name);
}
