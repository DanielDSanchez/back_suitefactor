package com.suitefactorback.suitefactorback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suitefactorback.suitefactorback.entities.Rol;
import com.suitefactorback.suitefactorback.entities.Usuario;
import com.suitefactorback.suitefactorback.entities.UsuarioRol;
import com.suitefactorback.suitefactorback.interfaceService.IRolService;
import com.suitefactorback.suitefactorback.interfaceService.IUsuarioRolService;
import com.suitefactorback.suitefactorback.interfaceService.IUsuarioService;
import com.suitefactorback.suitefactorback.interfaces.IUsuarioRol;

@Service
public class UsuarioRolService implements IUsuarioRolService {

    @Autowired
    private IUsuarioRol data;

    @Autowired
    private IRolService serviceRol;

    @Autowired
    private IUsuarioService serviceUsuario;

    @Override
    public List<UsuarioRol> buscarTodos() {
        return (List<UsuarioRol>) data.findAll();
    }

    @Override
    public Optional<UsuarioRol> buscarPorId(Long id) {
        return data.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        data.deleteById(id);
    }

    @Override
    public void guardar(Optional<Long> idUsuarioRol, Long idUsuario, Long idRol, int estado) {
        Usuario usuario = serviceUsuario.buscarPorId(idUsuario);
        Rol rol = serviceRol.buscarPorId(idRol);
        if (usuario != null && rol != null) {

            UsuarioRol usuarioRol = idUsuarioRol != null
                    ? this.buscarPorId(idUsuarioRol.orElse(null))
                            .orElse(null)
                    : new UsuarioRol();

            usuarioRol.setRol(rol);
            usuarioRol.setUsuario(usuario);
            usuarioRol.setEstado(estado);
            data.save(usuarioRol);
        }
    }

}
