package com.example.productos.gestionproductos.mapper;

import java.util.List;

import com.example.productos.gestionproductos.DTO.UsuarioDTO;
import com.example.productos.gestionproductos.model.Usuario;

public interface UsuarioMapper {

    Usuario toUsuario (UsuarioDTO usuarioDTO);
    Usuario toUsuarioDTO(Usuario usuario);
    List <UsuarioDTO> toUsuarioDTOs(List <Usuario> usuarios);
    void updateUsuario (Usuario usuario,UsuarioDTO usuarioDTO);

}
