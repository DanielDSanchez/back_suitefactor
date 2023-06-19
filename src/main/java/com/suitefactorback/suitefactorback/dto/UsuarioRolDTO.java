package com.suitefactorback.suitefactorback.dto;

import java.util.Optional;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UsuarioRolDTO {

    private Optional<Long> idUsuarioRol;
    private Long idUsuarios;
    private Long idRol;
    private int estado;
}
