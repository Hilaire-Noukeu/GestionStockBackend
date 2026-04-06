package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity{

    private String nomUser;
    private String prenomUser;
    private String telephoneUser;

    public User(){

    }
    public User( String nomUser, String prenomUser, String telephoneUser){
        this.nomUser=nomUser;
        this.prenomUser=prenomUser;
        this.telephoneUser=telephoneUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public String getTelephoneUser() {
        return telephoneUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public void setTelephoneUser(String telephoneUser) {


    }
}
