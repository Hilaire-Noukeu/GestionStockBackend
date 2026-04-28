package com.gestionStockBACKEND.gestionStockBACKEND.service.Impl;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.UsersDto;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.EntityNotFoundException;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.ErrorCodes;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.InvalidEntityException;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.UserRpository;
import com.gestionStockBACKEND.gestionStockBACKEND.service.UserService;
import com.gestionStockBACKEND.gestionStockBACKEND.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRpository userRpository;

    @Autowired
    public UserServiceImpl(UserRpository userRpository){
        this.userRpository=userRpository;
    }
    @Override
    public UsersDto save(UsersDto userDto) {
        List<String> errors= UserValidator.validate(userDto);
        if (!errors.isEmpty()){
            throw new InvalidEntityException("Utilisateur invalide", ErrorCodes.UTILISATEUR_NOT_VALID,errors);
        }
        return UsersDto.fromEntity(userRpository.save(UsersDto.toEntity(userDto)));
    }

    @Override
    public UsersDto findById(Integer id) {
        if (id==null){
            return null;
        }
        Optional<Users> user=userRpository.findById(id);
        return Optional.of(UsersDto.fromEntity(user.get()))
                .orElseThrow(()->new EntityNotFoundException("cet utilisateur n'existe pas",ErrorCodes.UTILISATEUR_NOT_FOUND));

    }

    @Override
    public List<UsersDto> findAll() {

        return userRpository.findAll()
                .stream()
                .map(UsersDto::fromEntity)
                .toList();
    }

    @Override
    public void delete(Integer id) {


    }
}
