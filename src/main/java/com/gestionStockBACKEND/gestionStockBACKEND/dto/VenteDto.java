package com.gestionStockBACKEND.gestionStockBACKEND.dto;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.LineVente;

import java.math.BigDecimal;
import java.util.List;

public class VenteDto {

    private Long id;
    private BigDecimal quantiteTotale;
    private String commentaire;
    private List<LineVenteDto> lineVentes;
    //private UserDto user;
}
