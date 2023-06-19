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

import com.suitefactorback.suitefactorback.dto.UsuarioRolDTO;
import com.suitefactorback.suitefactorback.entities.UsuarioRol;
import com.suitefactorback.suitefactorback.interfaceService.IUsuarioRolService;

@RestController
@RequestMapping("/api/usuariorol")
public class UsuarioRolController {

    @Autowired
    private IUsuarioRolService service;

    @GetMapping("")
    public List<UsuarioRol> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public UsuarioRol buscarPorId(@PathVariable String id) {
        return service.buscarPorId(Long.parseLong(id))
        .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(Long.parseLong(id));
    }

    @PostMapping("")
    public void guardar(@RequestBody UsuarioRolDTO usuarioRolDTO) {
        service.guardar(usuarioRolDTO.getIdUsuarioRol(),
                usuarioRolDTO.getIdUsuarios(),
                usuarioRolDTO.getIdRol(),
                usuarioRolDTO.getEstado());
    }
}
