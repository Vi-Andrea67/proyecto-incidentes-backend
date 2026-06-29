package com.miproyecto.incidentes.repository;

import com.miproyecto.incidentes.model.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IncidenteRepository extends JpaRepository<Incidente, Long> {

    List<Incidente> findByOficina(String oficina);
    List<Incidente> findByEstado(String estado);
    List<Incidente> findByPrioridad(String prioridad);
}
