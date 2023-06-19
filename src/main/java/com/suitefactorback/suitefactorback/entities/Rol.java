package com.suitefactorback.suitefactorback.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "rol")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id_Rol", unique = true)
    private Long idRol;

    @Column(name = "ROLTIPO", nullable = false, length = 50, unique = true)
    private String rolTipo;

    @Column(name = "Estado", nullable = false, length = 1, unique = false)
    private int estado;
}