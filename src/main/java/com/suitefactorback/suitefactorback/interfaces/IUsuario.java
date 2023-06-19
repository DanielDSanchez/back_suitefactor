
package com.suitefactorback.suitefactorback.interfaces;


import org.springframework.data.repository.CrudRepository;

import com.suitefactorback.suitefactorback.entities.Usuario;

public interface IUsuario extends CrudRepository<Usuario,Long>{
}
