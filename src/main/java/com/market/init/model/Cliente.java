package com.market.init.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clientes")

public class Cliente {

    @Id
    private String usuario;
    private String passwprd;
    private String nombre;
    private String direccion;
    private String email;

}
