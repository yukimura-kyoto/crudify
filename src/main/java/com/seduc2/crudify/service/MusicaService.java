package com.seduc2.crudify.service;

import com.seduc2.crudify.entity.Musica;
import com.seduc2.crudify.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicaService {

    @Autowired
    MusicaRepository musicaRepository;

    public List<Musica> mostrarMusicas(){
        List<Musica> lista = new ArrayList<>();
        lista = musicaRepository.findAll();
        return lista;
    }
}
