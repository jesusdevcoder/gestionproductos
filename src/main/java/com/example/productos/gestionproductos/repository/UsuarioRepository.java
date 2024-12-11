package com.example.productos.gestionproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productos.gestionproductos.model.Usuario;


@Repository

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
