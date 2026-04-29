package com.gestionStockBACKEND.gestionStockBACKEND.repository;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
