package com.Practica3Grupo9.service;

import com.Practica3Grupo9.domain.ArbolDomain;
import com.Practica3Grupo9.repository.ArbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ArbolService {

    @Autowired
    private ArbolRepository arbolRepository;

 
    public List<Arbol> obtenerArboles() {
        return arbolRepository.findAll();
    }

    
    public void guardarArbol(Arbol arbol) {
        arbolRepository.save(arbol);
    }

   
    public Optional<Arbol> obtenerArbolPorId(Long id) {
        return arbolRepository.findById(id);
    }

 
    public boolean eliminarArbol(Long id) {
        if (arbolRepository.existsById(id)) {
            arbolRepository.deleteById(id);
            return true;
        } else {
            return false; 
        }
    }
}