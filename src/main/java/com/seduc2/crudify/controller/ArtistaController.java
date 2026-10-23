package com.seduc2.crudify.controller;

import com.seduc2.crudify.entity.Artista;
import com.seduc2.crudify.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("artistas")
public class ArtistaController {

    @Autowired
    ArtistaService artistaService;

    @GetMapping
    public List<Artista> mostrarArtista(){
        return artistaService.mostrarArtista();
    }

}
