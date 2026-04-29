package com.gestionStockBACKEND.gestionStockBACKEND.dto;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.Article;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.LineVente;
import lombok.*;

import java.math.BigDecimal;
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LineVenteDto {
    private Long id;
    private BigDecimal quantite;
    private ArticleDto article;
    private VenteDto vente;


    //Construire la DTO a partir de l'entite
    public static LineVenteDto fromEntity(LineVente lineVente){
        if (lineVente==null){
            return null;
        }
        return LineVenteDto.builder()
                .id(lineVente.getId())
                .quantite(lineVente.getQuantite())
                .article(ArticleDto.fromEntity(lineVente.getArticle()))
                .vente(VenteDto.fromEntity(lineVente.getVente()))
                .build();

    }

    //Construire l'entite a partir de la DTO
    public static LineVente toEntity(LineVenteDto lineVenteDto){
        if (lineVenteDto==null){
            return null;
        }
        LineVente lineVente=new LineVente();
        lineVente.setId(lineVenteDto.getId());
        lineVente.setQuantite(lineVenteDto.getQuantite());
        lineVente.setArticle(ArticleDto.toEntity(lineVenteDto.getArticle()));
        lineVente.setVente(VenteDto.toEntity(lineVenteDto.getVente()));
        return lineVente;
    }
}
