package com.suitefactorback.suitefactorback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suitefactorback.suitefactorback.entities.Rol;
import com.suitefactorback.suitefactorback.interfaceService.IRolService;

@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    private IRolService service;

    @GetMapping("")
    public List<Rol> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public Rol buscarPorId(@PathVariable String id) {
        return service.buscarPorId(Long.parseLong(id));
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(Long.parseLong(id));
    }

    @PostMapping("")
    public void guardar(@RequestBody Rol rol) {
        service.guardar(rol);
    }
}
