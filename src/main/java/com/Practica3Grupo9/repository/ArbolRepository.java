package com.Practica3Grupo9.repository;

import com.Practica3Grupo9.domain.ArbolDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbolRepository extends JpaRepository<Arbol, Long> {
}
