package com.example.cidadela.service;

import com.example.cidadela.dto.CatalogoResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RickAndMortyService {
    private final String API_URL = "https://rickandmortyapi.com/api/character";

    public CatalogoResponse buscarCatalogo(int pagina) {
        RestTemplate restTemplate = new RestTemplate();

        String urlComPagina = API_URL + "?page=" + pagina;

        return restTemplate.getForObject(urlComPagina, CatalogoResponse.class);
    }
}
