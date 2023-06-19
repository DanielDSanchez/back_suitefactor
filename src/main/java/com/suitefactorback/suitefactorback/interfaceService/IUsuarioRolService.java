package com.suitefactorback.suitefactorback.interfaceService;

import java.util.List;
import java.util.Optional;
import com.suitefactorback.suitefactorback.entities.UsuarioRol;

public interface IUsuarioRolService {
    public List<UsuarioRol> buscarTodos();

    public Optional<UsuarioRol> buscarPorId(Long id);

    public void eliminar(Long id);

    public void guardar(Optional<Long> idUsuarioRol, Long idRol, Long idUsuario, int estado);
}
