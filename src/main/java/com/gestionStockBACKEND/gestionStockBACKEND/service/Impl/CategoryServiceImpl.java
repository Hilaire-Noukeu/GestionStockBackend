package com.gestionStockBACKEND.gestionStockBACKEND.service.Impl;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.CategoryDto;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Category;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.EntityNotFoundException;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.ErrorCodes;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.InvalidEntityException;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.InvalidOperationException;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.CategoryRepository;
import com.gestionStockBACKEND.gestionStockBACKEND.service.CategoryService;
import com.gestionStockBACKEND.gestionStockBACKEND.validator.CategoryValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    @Override
    public CategoryDto save(CategoryDto categoryDto) {
       List<String> errors= CategoryValidate.validate(categoryDto);
       if (!errors.isEmpty()){
           throw new InvalidEntityException("categorie invalide");
       }
       return CategoryDto.fromEntity(categoryRepository
               .save(CategoryDto.toEntity(categoryDto)));

    }

    @Override
    public CategoryDto findById(Long id) {
        if (id==null){
            throw new EntityNotFoundException("category de ID"+id+"n'existe pas");
        }
        Optional<Category> category=categoryRepository.findById(id);
        return Optional.of(CategoryDto.fromEntity(category.get()))
                .orElseThrow(()-> new EntityNotFoundException("category introuvable", ErrorCodes.CATEGORY_NOT_FOUND));
    }

    @Override
    public List<CategoryDto> findAll() {
        return categoryRepository.findAll()
                .stream()
                .map(CategoryDto::fromEntity)
                .toList();
    }

    @Override
    public void delete(Long id) {
        if (id==null){
            return;
        }
        Boolean existsInCategory=categoryRepository.existsById(id);
        if (existsInCategory){
            throw new InvalidOperationException("On ne peut supprimer cette categorie car un article lui est associe");
        }
        categoryRepository.deleteById(id);

    }
}
