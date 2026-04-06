package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Vente extends AbstractEntity{

    @OneToMany(mappedBy = "vente")
    private List<LineVente> lineVentes;

}
