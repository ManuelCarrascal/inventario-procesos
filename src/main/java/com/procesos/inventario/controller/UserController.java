package com.procesos.inventario.controller;

import com.procesos.inventario.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("users/{id}")
        public User getUserById(@PathVariable Long id){
        User user = new User(id, "Manuel", "Carrascal", "kdx 857-150","correo@correo.com","3142734677","123456","1007912596");
        return user;
    }
}
