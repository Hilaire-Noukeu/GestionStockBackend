package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Vente extends AbstractEntity{

    private BigDecimal quantiteTotale;
    private String commentaire;

    @OneToMany(mappedBy = "vente")
    private List<LineVente> lineVentes;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

}
