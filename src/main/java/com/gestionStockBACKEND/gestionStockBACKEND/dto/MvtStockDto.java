package com.gestionStockBACKEND.gestionStockBACKEND.dto;


import com.gestionStockBACKEND.gestionStockBACKEND.entity.MvtStock;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.TypeMvt;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MvtStockDto {
    private Integer id;
    private TypeMvt type;
    private ArticleDto article;

    //Construire la DTO a partir de l'entite
    public static MvtStockDto fromEntity(MvtStock mvtStock){
        if (mvtStock==null){
            return null;
        }
        return MvtStockDto.builder()
                .id(mvtStock.getId())
                .type(mvtStock.getType())
                .article(ArticleDto.fromEntity(mvtStock.getArticle()))
                .build();

    }

    //Construire l'entite a partir de la DTO
    public static MvtStock toEntity(MvtStockDto mvtStockDto){
        if (mvtStockDto==null){
            return null;
        }
        MvtStock mvtStock=new MvtStock();
        mvtStock.setId(mvtStockDto.getId());
        mvtStock.setType(mvtStockDto.getType());
        mvtStock.setArticle(ArticleDto.toEntity(mvtStockDto.getArticle()));
        return mvtStock;
    }
}
