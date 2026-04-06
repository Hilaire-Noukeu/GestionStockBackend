package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.EqualsAndHashCode;


import java.math.BigDecimal;

@Entity
@Builder
@EqualsAndHashCode(callSuper = true)
public class LineVente extends AbstractEntity{

    private BigDecimal quantite;
    @ManyToOne
    @JoinColumn(name = "vente_id")
    private Vente vente;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public LineVente(){

    }
    public LineVente(Vente vente, BigDecimal quantite, Article article){
        this.vente=vente;
        this.quantite=quantite;
        this.article=article;
    }

    public Vente getVente() {
        return vente;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public Article getArticle() {
        return article;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
