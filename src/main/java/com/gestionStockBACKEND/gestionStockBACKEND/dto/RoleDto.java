package com.gestionStockBACKEND.gestionStockBACKEND.dto;


import com.gestionStockBACKEND.gestionStockBACKEND.entity.Role;
import lombok.*;

import java.util.List;
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
    private Long id;
    private String nomRole;
    private List<UsersDto> users;

    //Construire la DTO a partir de l'entite
    public static RoleDto fromEntity(Role role){
        if (role==null){
            return null;
        }
        return RoleDto.builder()
                .id(role.getId())
                .nomRole(role.getNomRole())
                .build();
    }

    //Constuire l'entite a partir de la DTO
    public static Role toEntity(RoleDto roleDto){
        if (roleDto==null){
            return null;
        }
        Role role=new Role();
        role.setId(roleDto.getId());
        role.setNomRole(roleDto.getNomRole());
        return role;
    }
}
