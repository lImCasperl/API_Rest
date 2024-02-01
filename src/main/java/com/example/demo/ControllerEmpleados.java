package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerEmpleados {

    @Autowired
    private EmpleadosService service;

    @GetMapping("/usuarios")
    public List<Empleados> getEmpleados() {
        return service.getEmpleados();
    }

    @GetMapping("/empleados")
    public Empleados getEmpleado(int id) {
        return service.getEmpleado(id);
    }

    @PostMapping("/empleados")
    public boolean insertEmeplado(@RequestBody Empleados empleados) {
        return service.insertEmpleados(empleados);
    }

    @PutMapping("/empleados")
    public boolean updateEmpleados(@RequestBody Empleados empleados) {
        return service.updateEmpleados(empleados);
    }

    @DeleteMapping("/empleados")
    public boolean deleteEmpleados(int id) {
        return service.deleteEmpleados(id);
    }

}
