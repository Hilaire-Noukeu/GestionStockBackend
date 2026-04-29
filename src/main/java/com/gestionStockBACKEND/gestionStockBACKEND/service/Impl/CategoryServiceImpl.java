package com.gestionStockBACKEND.gestionStockBACKEND.service.Impl;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.CategoryDto;
import com.gestionStockBACKEND.gestionStockBACKEND.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto findById(Integer id) {
        return null;
    }

    @Override
    public List<CategoryDto> findAll() {
        return List.of();
    }

    @Override
    public void delete(Integer id) {

    }
}
