package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Category extends AbstractEntity{
    private String nameCategory;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;

}
