package com.gestionStockBACKEND.gestionStockBACKEND.repository;


import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRpository extends JpaRepository<Users, Long> {
}
