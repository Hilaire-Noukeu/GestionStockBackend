package com.gestionStockBACKEND.gestionStockBACKEND.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Enterprise {
    @Id
    @GeneratedValue
    private Long id;
    private String nameEnterprise;
    private String country;
    private String city;
    private String phone;
    private String logo;

}
