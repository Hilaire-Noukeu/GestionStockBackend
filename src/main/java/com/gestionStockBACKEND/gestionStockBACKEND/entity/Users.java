package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Users extends AbstractEntity{

    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

   @OneToMany(mappedBy = "user")
    private List<Vente> ventes;

}
