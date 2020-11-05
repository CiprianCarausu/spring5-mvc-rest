package cyker.springframework.spring5mvcrest.repositories;

import cyker.springframework.spring5mvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
