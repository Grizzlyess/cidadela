package com.example.cidadela.controller;

import com.example.cidadela.dto.CatalogoResponse;
import com.example.cidadela.service.RickAndMortyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogoController {

    private final RickAndMortyService service;

    public CatalogoController(RickAndMortyService service) {
        this.service = service;
    }

    // A rota local que você vai digitar no navegador
    @GetMapping("/catalogo")
    public CatalogoResponse listarPersonagens(@RequestParam(defaultValue = "1") int pagina) {
        return service.buscarCatalogo(pagina);
    }
}