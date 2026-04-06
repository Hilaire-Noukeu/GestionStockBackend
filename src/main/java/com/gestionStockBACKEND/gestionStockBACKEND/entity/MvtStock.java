package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class MvtStock extends AbstractEntity{
    private TypeMvt type;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
