package com.Empleado.PracticaSpringBootEmpleado.Repo;

import com.Empleado.PracticaSpringBootEmpleado.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado,Integer> {
}
