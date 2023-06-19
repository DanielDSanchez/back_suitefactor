
package com.suitefactorback.suitefactorback.service;

import com.suitefactorback.suitefactorback.entities.Usuario;
import com.suitefactorback.suitefactorback.interfaceService.IUsuarioService;
import com.suitefactorback.suitefactorback.interfaces.IUsuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuario data;

    @Override
    public List<Usuario> buscarTodos() {
        return (List<Usuario>) data.findAll();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return (Usuario) data.findById(id).get();
    }

    @Override
    public void eliminar(Long id) {
        data.deleteById(id);
    }

    @Override
    public void guardar(Usuario usuario) {
        data.save(usuario);
    }

}
