package com.gestionStockBACKEND.gestionStockBACKEND.repository;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.LineVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<LineVente,Long> {
    boolean existsByArticleId(Long articleId);
}
