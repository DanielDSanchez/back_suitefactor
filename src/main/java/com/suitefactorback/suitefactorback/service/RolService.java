package com.suitefactorback.suitefactorback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suitefactorback.suitefactorback.entities.Rol;
import com.suitefactorback.suitefactorback.interfaceService.IRolService;
import com.suitefactorback.suitefactorback.interfaces.IRol;

@Service
public class RolService implements IRolService {

    @Autowired
    private IRol data;

    @Override
    public List<Rol> buscarTodos() {
        return (List<Rol>) data.findAll();
    }

    @Override
    public Rol buscarPorId(Long id) {
        return (Rol) data.findById(id).get();
    }

    @Override
    public void eliminar(Long id) {
        data.deleteById(id);
    }

    @Override
    public void guardar(Rol rol) {
        data.save(rol);
    }

}
