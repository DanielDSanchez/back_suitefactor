
package com.suitefactorback.suitefactorback.interfaceService;

import java.util.List;

import com.suitefactorback.suitefactorback.entities.Usuario;

public interface IUsuarioService {
    public List<Usuario> buscarTodos();

    public Usuario buscarPorId(Long id);

    public void eliminar(Long id);

    public void guardar(Usuario usuario);
}
