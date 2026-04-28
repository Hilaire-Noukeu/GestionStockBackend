package com.gestionStockBACKEND.gestionStockBACKEND.validator;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.UsersDto;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {
    public static List<String> validate(UsersDto userDto){
        List<String> errors=new ArrayList<>();
        if (userDto==null){
            errors.add("email non renseigne");
            errors.add("mot de passe non renseigne");
            return errors;
        }
        if (!StringUtils.hasLength(userDto.getEmail())){
            errors.add("renseigner l'email");
            return errors;
        }
        if (!StringUtils.hasLength(userDto.getPassword())){
            errors.add("renseigner le mot de passe");
            return errors;
        }
        return errors;

    }
}
