package by.grsu.vitovt.carsharing.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    @GetMapping("/")
    public String getRoles(){
        return "";
    }
}
