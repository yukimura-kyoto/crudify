package com.seduc2.crudify.controller;

import com.seduc2.crudify.entity.Musica;
import com.seduc2.crudify.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("musicas")
public class MusicaController {

    @Autowired
    MusicaService musicaService;

    @GetMapping
    public List<Musica> mostrarMusicas(){
        return musicaService.mostrarMusicas();
    }
}
