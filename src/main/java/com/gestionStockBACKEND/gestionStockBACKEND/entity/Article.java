package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Builder
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


    //Constructeurs
    public Article(){

    }
    public Article(String code, String nomArticle, BigDecimal prixUnitaireHt, Category category){
        this.code=code;
        this.nomArticle=nomArticle;
        this.prixUnitaireHt=prixUnitaireHt;
        this.category=category;

    }

    //Getter

    public String getCode() {
        return code;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public BigDecimal getPrixUnitaireHt() {
        return prixUnitaireHt;
    }

    public Category getCategory() {
        return category;
    }
    //Setteurs

    public void setCode(String code) {
        this.code = code;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
        this.prixUnitaireHt = prixUnitaireHt;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

