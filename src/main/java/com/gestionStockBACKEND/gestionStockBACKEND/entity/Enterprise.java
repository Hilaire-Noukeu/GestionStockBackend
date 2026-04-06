package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Enterprise {
    @Id
    @GeneratedValue
    private Long id;
    private String nameEnterprise;
    private String country;
    private String city;
    private String phone;
    private String logo;

    //Constructeurs

    public Enterprise(){

    }
    public Enterprise(Long id, String nameEnterprise, String country, String city, String phone, String logo){
        this.id=id;
        this.nameEnterprise=nameEnterprise;
        this.country=country;
        this.city=city;
        this.phone=phone;
        this.logo=logo;
    }

    //Getter


    public Long getId() {
        return id;
    }

    public String getNameEnterprise() {
        return nameEnterprise;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getLogo() {
        return logo;
    }

    //Setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setNameEnterprise(String nameEnterprise) {
        this.nameEnterprise = nameEnterprise;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
