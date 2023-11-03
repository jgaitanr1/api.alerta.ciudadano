package com.alerta.ciudadano.api.security.services;

import java.util.Set;

import com.alerta.ciudadano.api.models.User;

public interface UsuarioService {

	User agregarUsuario(User user);

	User actualizarUsuario(User user);

    Set<User> obtenerUsuarios();

    User obtenerUsuario(Long id);

    void eliminarUsuario(Long id);
    
}
