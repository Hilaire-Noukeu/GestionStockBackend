package com.gestionStockBACKEND.gestionStockBACKEND.dto;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.LineVente;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Vente;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VenteDto {

    private Integer id;
    private BigDecimal quantiteTotale;
    private String commentaire;
    private List<LineVenteDto> lineVentes;
    private UsersDto user;

    //Constuire la DTO a partir de l'entite
    public static VenteDto fromEntity(Vente vente){
        if (vente==null){
            return null;
        }
       return VenteDto.builder()
                .id(vente.getId())
                .quantiteTotale(vente.getQuantiteTotale())
                .commentaire(vente.getCommentaire())
                .user(UsersDto.fromEntity(vente.getUser()))
                .build();
    }
    //Constuire l'entite a partir de la DTO
    public static Vente toEntity(VenteDto venteDto){
        if (venteDto==null){
            return null;
        }
        Vente vente=new Vente();
        vente.setId(venteDto.getId());
        vente.setQuantiteTotale(venteDto.getQuantiteTotale());
        vente.setCommentaire(venteDto.getCommentaire());
        vente.setUser(UsersDto.toEntity(venteDto.getUser()));
        return vente;
    }
}
