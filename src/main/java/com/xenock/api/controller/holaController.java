package com.xenock.api.controller;

import com.xenock.api.models.Cliente;
import org.springframework.web.bind.annotation.*;


@RestController
public class holaController {
    
    @GetMapping("/hola/{nameparam}")
    public String getHello(@PathVariable String nameparam,
                           @RequestParam String edad){
        
        //@PathVariable para variable de la url
        //@RequestParam para valores con llave y valor ej: http://localhost:8080/hola/fede?edad=18
        
        return "Hola mundo " + nameparam + " y tengo " + edad;
    }
    
    @PostMapping("/cliente")
    public void postClient(@RequestBody Cliente cl){
        System.out.println("Nombre: " + cl.getName() + ", Apellido: " + cl.getSurname());
    }
}
