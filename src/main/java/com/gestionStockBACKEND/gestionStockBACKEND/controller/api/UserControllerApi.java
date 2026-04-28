package com.gestionStockBACKEND.gestionStockBACKEND.controller.api;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.UsersDto;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static com.gestionStockBACKEND.gestionStockBACKEND.utils.Constant.APP_ROOT;

public interface UserControllerApi {

    @PostMapping(value = APP_ROOT+"/user",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    UsersDto save(@RequestBody UsersDto userDto);

    @GetMapping(value =APP_ROOT+"/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    UsersDto findById(@PathVariable Integer id);

    @GetMapping(value = APP_ROOT+"/usersAll", produces = MediaType.APPLICATION_JSON_VALUE)
    List<UsersDto> findAll();
    void delete(Integer id);
}
