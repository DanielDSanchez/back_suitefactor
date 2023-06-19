
package com.suitefactorback.suitefactorback.controller;

import com.suitefactorback.suitefactorback.entities.Usuario;
import com.suitefactorback.suitefactorback.interfaceService.IUsuarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService service;

    @GetMapping("")
    public List<Usuario> buscarTodos() {
        return (List<Usuario>) service.buscarTodos();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable String id) {
        return service.buscarPorId(Long.parseLong(id));
    } 

    @PostMapping("")
    public void guardar(@RequestBody Usuario usuario) {
        service.guardar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id){
        service.eliminar(Long.parseLong(id));
    }
}
