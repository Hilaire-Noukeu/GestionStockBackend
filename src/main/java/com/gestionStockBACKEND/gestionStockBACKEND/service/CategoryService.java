package com.gestionStockBACKEND.gestionStockBACKEND.service;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);
    CategoryDto findById(Integer id);
    List<CategoryDto> findAll();
    void delete(Integer id);
}
