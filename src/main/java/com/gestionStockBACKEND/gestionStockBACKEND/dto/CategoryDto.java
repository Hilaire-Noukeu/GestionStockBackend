package com.gestionStockBACKEND.gestionStockBACKEND.dto;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.Article;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Category;
import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Integer id;
    private String nameCategory;
    private List<ArticleDto> articles;

    //Construire la DTO a partir de l'entite

    public static CategoryDto fromEntity(Category category){
        if (category==null){
            return null;
        }
        return CategoryDto.builder()
                .id(category.getId())
                .nameCategory(category.getNameCategory())
                .build();
    }

    //Construire l'entite a partir de la DTO

    public static Category toEntity(CategoryDto categoryDto){
        if (categoryDto==null){
            return null;
        }
        Category category=new Category();
        category.setId(categoryDto.getId());
        category.setNameCategory(categoryDto.getNameCategory());
        return category;
    }
}
