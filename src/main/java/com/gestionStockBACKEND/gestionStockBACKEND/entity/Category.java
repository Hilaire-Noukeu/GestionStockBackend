package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Category extends AbstractEntity{
    private String nameCategory;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;

    //Constructeurs

    public Category(){

    }
    public Category(String nameCategory, List<Article> articles){
        this.nameCategory=nameCategory;
        this.articles=articles;
    }
    //Getters

    public String getNameCategory() {
        return nameCategory;
    }

    public List<Article> getArticles() {
        return articles;
    }
    //Setters


    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
