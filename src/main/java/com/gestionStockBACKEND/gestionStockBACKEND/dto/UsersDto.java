package com.gestionStockBACKEND.gestionStockBACKEND.dto;


import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;
import lombok.*;

import java.util.List;
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private Long id;
    private String email;
    private String password;
    private RoleDto role;
    private List<VenteDto> ventes;

    //Constuire la DTO a partir de l'entite
    public static UsersDto fromEntity(Users user){
        if (user==null){
            return null;
        }
        return UsersDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .role(RoleDto.fromEntity(user.getRole()))
                .build();
    }

    //Construire l'entite a partir de la DTO
    public static Users toEntity(UsersDto userDto){
        if (userDto==null){
            return null;
        }
        Users user=new Users();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRole(RoleDto.toEntity(userDto.getRole()));
        return user;
    }
}
