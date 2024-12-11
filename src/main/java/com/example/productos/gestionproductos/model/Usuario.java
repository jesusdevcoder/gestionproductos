package com.example.productos.gestionproductos.model;
// import javax.persistence.Entity;
// import javax.persistence.Id;

import jakarta.persistence.*;
@Entity
// especifica el nombre de la tabla en la base de datos si no tomara el nombre de la clase 
@Table(name="usuarios") 

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;


    @Column(nullable = true)
    private String email;


    // getters y setters 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
