package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@Builder
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String nomRole;

    public Role(){

    }

    public Role(Long id, String nomRole){
        this.id=id;
        this.nomRole=nomRole;
    }

    public Long getId() {
        return id;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }
}
