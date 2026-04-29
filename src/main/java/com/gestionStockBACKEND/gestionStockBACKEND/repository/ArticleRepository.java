package com.gestionStockBACKEND.gestionStockBACKEND.repository;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Optional<Article> findByCode(String code);

}
