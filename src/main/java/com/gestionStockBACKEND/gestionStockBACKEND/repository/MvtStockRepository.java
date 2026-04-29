package com.gestionStockBACKEND.gestionStockBACKEND.repository;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStockRepository extends JpaRepository<MvtStock, Long> {
}
