package com.Empleado.PracticaSpringBootEmpleado.Service;

import com.Empleado.PracticaSpringBootEmpleado.Entity.Empleado;
import com.Empleado.PracticaSpringBootEmpleado.Repo.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepo empleadorepo;

    public Empleado insertar(Empleado emp){
        return empleadorepo.save(emp);
    }

    public Empleado actualizar(Empleado emp){
        return empleadorepo.save(emp);
    }

    public List<Empleado> listar(){
        return empleadorepo.findAll();
    }

    public void eliminar(Empleado emp){
        empleadorepo.delete(emp);
    }

    public Optional<Empleado> buscar(int id){
        return empleadorepo.findById(id);
    }

}
