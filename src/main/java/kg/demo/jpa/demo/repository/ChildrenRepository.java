package kg.demo.jpa.demo.repository;

import kg.demo.jpa.demo.entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Long> {
    boolean existsChildrenById(Long id);
}
