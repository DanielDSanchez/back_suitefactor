
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
@Table(name="usuarios")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios")
    private Long idUsuarios;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "contrasena", insertable = true, updatable = true)
    private String contrasena;

    @Column(name = "Tipo_documento")
    private String tipoDocumento;

    @Column(name = "Documento")
    private String documento;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Email")
    private String email;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "Ciudad")
    private String ciudad;

    @Column(name = "Estado")
    private int estado;

}
