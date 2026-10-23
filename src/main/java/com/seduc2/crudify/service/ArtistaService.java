package com.seduc2.crudify.service;

import com.seduc2.crudify.entity.Artista;
import com.seduc2.crudify.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaService {

    @Autowired
    ArtistaRepository artistaRepository;

    public List<Artista> mostrarArtista(){
        List<Artista> lista = new ArrayList();
        lista = artistaRepository.findAll();
        return lista;
    }

}
