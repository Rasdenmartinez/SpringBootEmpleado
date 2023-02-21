package com.Empleado.PracticaSpringBootEmpleado.Controller;

import com.Empleado.PracticaSpringBootEmpleado.Entity.Empleado;
import com.Empleado.PracticaSpringBootEmpleado.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("empleados")
public class EmpleadoController {
    private EmpleadoService emp;
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/mostrar")
    public List<Empleado> listar(){
        return empleadoService.listar();
    }
    @PutMapping
    public Empleado actualizar(@RequestBody Empleado emp){
        return empleadoService.actualizar(emp);
    }
    @PostMapping
    public Empleado insertar(@RequestBody Empleado emp){
        return empleadoService.insertar(emp);
    }

    @DeleteMapping
    public void borrar(@RequestBody Empleado emp){
         empleadoService.eliminar(emp);
    }

    @GetMapping("buscar/{id}")
    public Optional<Empleado> buscar(@PathVariable int id){
        return empleadoService.buscar(id);
    }



}



