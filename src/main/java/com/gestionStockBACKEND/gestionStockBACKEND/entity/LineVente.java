package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;


import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@EqualsAndHashCode(callSuper = true)
public class LineVente extends AbstractEntity{

    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "vente_id")
    private Vente vente;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
