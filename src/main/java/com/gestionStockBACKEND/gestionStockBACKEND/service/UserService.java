package com.gestionStockBACKEND.gestionStockBACKEND.service;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.UsersDto;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;

import java.util.List;

public interface UserService {
    UsersDto save(UsersDto userDto);
    UsersDto findById(Integer id);
    List<UsersDto> findAll();
    void delete(Integer id);
}
