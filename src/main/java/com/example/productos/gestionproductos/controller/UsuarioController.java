package com.example.productos.gestionproductos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productos.gestionproductos.model.Usuario;
import com.example.productos.gestionproductos.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;
// Indica que esta clase es un controlador y que todas las respuestas serán automáticamente serializadas a JSON
@RestController
@RequestMapping("/usuarios") // Base URL para las rutas

public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

     // Método para obtener todos los usuarios
    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    // Método para obtener un usuario por su ID
    @GetMapping("/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id);

    }

        // Método para guardar un nuevo usuario
    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

     @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }


}
