package com.miproyecto.incidentes.controller;

import java.util.List;
import com.miproyecto.incidentes.model.Incidente;
import com.miproyecto.incidentes.repository.IncidenteRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/incidentes")
public class IncidenteController {

    private final IncidenteRepository repository;


    public IncidenteController(IncidenteRepository repository) {
        this.repository = repository;
    }



    // CREAR INCIDENTE
    @PostMapping
public Incidente crearIncidente(@RequestBody Incidente incidente) {

    // VALIDACIÓN para evitar datos incompletos 
    if (incidente.getDescripcion() == null || incidente.getDescripcion().isEmpty()) {
        throw new RuntimeException("La descripción es obligatoria");
    }

    incidente.setEstado("Pendiente");
    return repository.save(incidente);
}

    // LISTAR INCIDENTES
    @GetMapping
    public List<Incidente> listarIncidentes() {
        return repository.findAll();
    }
    
    @GetMapping("/oficina/{oficina}")
public List<Incidente> obtenerPorOficina(@PathVariable String oficina) {
    return repository.findByOficina(oficina);
}

    @GetMapping("/historial/{id}")
public List<Incidente> obtenerHistorial(@PathVariable Long id) {
    return repository.findAll()
            .stream()
            .filter(i -> id.equals(i.getIncidentePadreId()))
            .toList();

}
    @GetMapping("/{id}")
public Incidente obtenerPorId(@PathVariable Long id) {
    return repository.findById(id).orElse(null);
}

@GetMapping("/estado/{estado}")
public List<Incidente> obtenerPorEstado(
        @PathVariable String estado) {

    return repository.findByEstado(estado);
}

@GetMapping("/prioridad/{prioridad}")
public List<Incidente> obtenerPorPrioridad(
        @PathVariable String prioridad) {

    return repository.findByPrioridad(prioridad);
}

@PutMapping("/{id}/estado")
public Incidente actualizarEstado(
        @PathVariable Long id,
        @RequestParam String estado) {

    Incidente incidente = repository.findById(id).orElse(null);

    if (incidente == null) {
        return null;
    }

    incidente.setEstado(estado);

    return repository.save(incidente);
}

}

