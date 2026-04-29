package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String nomRole;
    @OneToMany(mappedBy = "role")
    private List<Users> users;

}
