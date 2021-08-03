package kg.demo.jpa.demo.repository;

import kg.demo.jpa.demo.entity.Wife;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WifeRepository extends JpaRepository<Wife, Long> {
}
