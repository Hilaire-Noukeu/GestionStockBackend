package com.gestionStockBACKEND.gestionStockBACKEND.dto;

import com.gestionStockBACKEND.gestionStockBACKEND.entity.Enterprise;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseDto {
    private Long id;
    private String nameEnterprise;
    private String country;
    private String city;
    private String phone;
    private String logo;

    //Construire la DTO a partir de l'entite
    public static EnterpriseDto fromEntity(Enterprise enterprise){
        if (enterprise==null){
            return null;
        }
        return EnterpriseDto.builder()
                .id(enterprise.getId())
                .nameEnterprise(enterprise.getNameEnterprise())
                .country(enterprise.getCountry())
                .city(enterprise.getCity())
                .phone(enterprise.getPhone())
                .logo(enterprise.getLogo())
                .build();
    }

    //Construire l'entite a partir de la DTO

    public static Enterprise toEntity(EnterpriseDto enterpriseDto){
        if (enterpriseDto==null){
            return null;
        }
        Enterprise enterprise=new Enterprise();
        enterprise.setId(enterpriseDto.getId());
        enterprise.setNameEnterprise(enterpriseDto.getNameEnterprise());
        enterprise.setCountry(enterpriseDto.getCountry());
        enterprise.setCity(enterpriseDto.getCity());
        enterprise.setPhone(enterpriseDto.getPhone());
        enterprise.setLogo(enterpriseDto.getLogo());
        return enterprise;
    }
}
