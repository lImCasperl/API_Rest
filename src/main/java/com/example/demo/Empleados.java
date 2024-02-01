package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empleados")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empleados {
    @Id
    private int id;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String fecha_nacimiento;
}
