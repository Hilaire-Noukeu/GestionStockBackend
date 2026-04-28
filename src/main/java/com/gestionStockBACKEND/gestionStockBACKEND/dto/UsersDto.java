package com.gestionStockBACKEND.gestionStockBACKEND.dto;


import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Builder
@Setter
@Getter
public class UsersDto {
    private Integer id;
    private String email;
    private String password;
   // private RoleDto role;
   // private List<VenteDto> ventes;

    public static UsersDto fromEntity(Users user){
        if (user==null){
            return null;
        }
        return UsersDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public static Users toEntity(UsersDto userDto){
        if (userDto==null){
            return null;
        }
        Users user=new Users();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return user;
    }
}
