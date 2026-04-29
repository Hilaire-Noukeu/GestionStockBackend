package com.gestionStockBACKEND.gestionStockBACKEND.repository;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente,Long> {
}
