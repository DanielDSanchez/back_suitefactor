package com.suitefactorback.suitefactorback.interfaceService;

import java.util.List;

import com.suitefactorback.suitefactorback.entities.Rol;

public interface IRolService {
    public List<Rol> buscarTodos();

    public Rol buscarPorId(Long id);

    public void eliminar(Long id);

    public void guardar(Rol rol);
}
