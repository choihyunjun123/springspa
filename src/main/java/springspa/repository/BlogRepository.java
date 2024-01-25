package springspa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springspa.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
