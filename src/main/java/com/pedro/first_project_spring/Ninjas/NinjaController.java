package com.pedro.first_project_spring.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String Helooooo(){
        return "Essa é a primeira mensagem nessa rota";
    }
}
