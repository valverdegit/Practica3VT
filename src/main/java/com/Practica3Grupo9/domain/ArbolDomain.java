package com.Practica3Grupo9.domain;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  // Asegura que el nombre coincide con la BD
    private Long idArbol;

    @Column(name = "nombre_comun", nullable = false) 
    private String nombreComun;

    @Column(name = "tipo_flor")
    private String tipoFlor;

    @Column(name = "dureza_madera")
    private Integer durezaMadera;

    @Column(name = "altura")
    private Double altura;

    @Column(name = "imagen_ruta", nullable = false)
    private String imagenRuta;

 
    public Long getIdArbol() {
        return idArbol;
    }

    public void setIdArbol(Long idArbol) {
        this.idArbol = idArbol;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public Integer getDurezaMadera() {
        return durezaMadera;
    }

    public void setDurezaMadera(Integer durezaMadera) {
        this.durezaMadera = durezaMadera;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getImagenRuta() {
        return imagenRuta;
    }

    public void setImagenRuta(String imagenRuta) {
        this.imagenRuta = imagenRuta;
    }
}