package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Article  extends AbstractEntity{
    private String code;
    private String nomArticle;
    private BigDecimal prixUnitaireHt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "article")
    private List<MvtStock> mvtStocks;

    @OneToMany(mappedBy = "article")
    private List<LineVente> lineVentes;

}

