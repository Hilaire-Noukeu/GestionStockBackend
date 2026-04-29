package com.gestionStockBACKEND.gestionStockBACKEND.validator;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto){
        List<String> errors=new ArrayList<>();
        if (articleDto==null){
            errors.add("Veuillez renseigner les champs de l'article");
            return errors;
        }
        if (!StringUtils.hasLength(articleDto.getCode())){
            errors.add("Veuillez renseigner le code de l'article");
            return errors;
        }
        if (!StringUtils.hasLength(articleDto.getNomArticle())){
            errors.add("Veuillez renseigner le libelle de l'article");
            return errors;
        }
        if (articleDto.getQuantite()==null){
            errors.add("Veuillez renseigner la quantite de l'article");
            return errors;
        }
        if (articleDto.getPrixUnitaireHt()==null){
            errors.add("Veuillez renseigner le prix de l'article");
            return errors;
        }
        if (articleDto.getCategory()==null){
            errors.add("veuillez selectionner une categorie");
            return errors;
        }

        return errors;
    }
}
