package com.gestionStockBACKEND.gestionStockBACKEND.dto;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.Article;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String code;
    private String nomArticle;
    private Integer quantite;
    private BigDecimal prixUnitaireHt;
    private CategoryDto category;
    private List<MvtStockDto> mvtStocks;
    private List<LineVenteDto> lineVentes;

    //Construire la DTO a partir de l'entite
    public static ArticleDto fromEntity(Article article){
        if (article==null){
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .code(article.getCode())
                .nomArticle(article.getNomArticle())
                .quantite(article.getQuantite())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .build();
    }

    //Construire l'entite a partir de la DTO
    public static Article toEntity(ArticleDto articleDto){
        if (articleDto==null){
            return null;
        }
        Article article=new Article();
        article.setId(articleDto.getId());
        article.setCode(articleDto.getCode());
        article.setNomArticle(articleDto.getNomArticle());
        article.setQuantite(articleDto.getQuantite());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
        return article;
    }
}
