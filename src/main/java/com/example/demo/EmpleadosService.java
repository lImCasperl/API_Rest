package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadosService {

        @Autowired
        private EmpleadosRepository repositorioEmpleados;

        public List<Empleados> getEmpleados(){
            return repositorioEmpleados.findAll();
    }
        public Empleados getEmpleado(int id) {
            return repositorioEmpleados.findById(id).orElse(null);
        }

        public boolean insertEmpleados(Empleados empleados) {
            try {
                repositorioEmpleados.save(empleados);
            } catch (Exception e) {
                return false;
            }
            return true;
        }

        public boolean updateEmpleados(Empleados empleados) {
            try {
                Empleados empleadosExistente = repositorioEmpleados.findById(empleados.getId()).orElse(null);
                empleadosExistente.setNombre(empleados.getNombre());
                empleadosExistente.setApaterno(empleados.getApaterno());
                empleadosExistente.setAmaterno(empleados.getAmaterno());
                empleadosExistente.setFecha_nacimiento(empleados.getFecha_nacimiento());
                repositorioEmpleados.save(empleadosExistente);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public boolean deleteEmpleados(int id) {
            try {
                Empleados empleadosExistente = repositorioEmpleados.findById(id).orElse(null);
                repositorioEmpleados.delete(empleadosExistente);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
}
