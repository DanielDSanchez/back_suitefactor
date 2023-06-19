package com.suitefactorback.suitefactorback.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario_rol")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_rol")
    private Long idUsuarioRol;

    @OneToOne
    @JoinColumn(name = "Id_Rol", referencedColumnName = "Id_Rol")
    private Rol rol;

    @OneToOne
    @JoinColumn(name = "Id_Usuarios", referencedColumnName = "id_usuarios")
    private Usuario usuario;

    @Column(name = "estado", nullable = false, length = 50, unique = true)
    private int estado;
}
