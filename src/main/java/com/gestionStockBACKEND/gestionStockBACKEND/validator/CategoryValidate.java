package com.gestionStockBACKEND.gestionStockBACKEND.validator;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidate {
    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors =new ArrayList<>();
        if (categoryDto==null){
            errors.add("Veuillez renseigner les champs de la categorie");
            return errors;
        }
        if (!StringUtils.hasLength(categoryDto.getNameCategory())){
            errors.add("renseigner la categorie");
            return errors;
        }
        if (categoryDto.getArticles()==null){
            errors.add("la liste des articles de la categories n'existe pas");
            return errors;
        }
        return errors;
    }
}
