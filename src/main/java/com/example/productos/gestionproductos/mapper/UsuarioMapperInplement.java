package com.example.productos.gestionproductos.mapper;

import java.util.List;



import com.example.productos.gestionproductos.DTO.UsuarioDTO;
import com.example.productos.gestionproductos.model.Usuario;


public class UsuarioMapperInplement implements UsuarioMapper {

    @Override
    public Usuario toUsuario(UsuarioDTO usuarioDTO) {
        if (usuarioDTO == null) {
            return null;
        }
    
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setEmail(usuarioDTO.getEmail());
       
    
        return usuario;
    }
    

    @Override
    public Usuario toUsuarioDTO(Usuario usuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UsuarioDTO> toUsuarioDTOs(List<Usuario> usuarios) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateUsuario(Usuario usuario, UsuarioDTO usuarioDTO) {
        // TODO Auto-generated method stub
        
    }



}
