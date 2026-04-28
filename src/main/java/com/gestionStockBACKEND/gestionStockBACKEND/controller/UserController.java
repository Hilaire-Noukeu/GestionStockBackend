package com.gestionStockBACKEND.gestionStockBACKEND.controller;


import com.gestionStockBACKEND.gestionStockBACKEND.controller.api.UserControllerApi;
import com.gestionStockBACKEND.gestionStockBACKEND.dto.UsersDto;
import com.gestionStockBACKEND.gestionStockBACKEND.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserControllerApi {

    private UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }
    @Override
    public UsersDto save(UsersDto userDto) {
        return userService.save(userDto);
    }

    @Override
    public UsersDto findById(Integer id) {
        return userService.findById(id);
    }

    @Override
    public List<UsersDto> findAll() {
        return userService.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
