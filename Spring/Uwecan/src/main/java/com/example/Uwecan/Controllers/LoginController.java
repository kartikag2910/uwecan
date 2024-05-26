package com.example.Uwecan.Controllers;

import com.example.Uwecan.DTO.UserDetailsDTO;
import com.example.Uwecan.Service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/login-controller")
public class LoginController {
@Autowired
    LoginService loginService;

    @PostMapping("/addUser")
    @CrossOrigin(origins = "http://localhost:3000")
    @Operation(summary = "To add a new user.")
    public Integer addUser(UserDetailsDTO userDetailsDTO){
        return loginService.addUser(userDetailsDTO);
    }

}
