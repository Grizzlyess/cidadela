package com.example.cidadela.dto;

import java.util.List;

public record CatalogoResponse(PageInfo info, List<CharacterDTO> results) {}

record PageInfo(int count, int pages, String next, String prev) {}

record Origin(String name) {}

record Location(String name) {}

record CharacterDTO(
        Long id,
        String name,
        String status,
        String species,
        String image,
        String gender,       // Gênero (Male, Female, etc)
        String type,         // Subespécie ou tipo (pode ser vazio)
        Origin origin,       // Objeto com o nome da origem
        Location location    // Objeto com o nome da localização atual
) {}