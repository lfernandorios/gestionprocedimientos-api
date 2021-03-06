package com.chinita.company.gestionprocedimientos.api.servicio;

import com.chinita.company.gestionprocedimientos.api.modelo.Persona;
import com.chinita.company.gestionprocedimientos.api.servicio.modelo.PersonaGuardarCmd;
import org.springframework.data.domain.Page;

import javax.validation.constraints.NotNull;
import org.springframework.data.domain.Pageable;

public interface PersonaServicio {

    Persona crear(@NotNull PersonaGuardarCmd personaACrearCmd);
    Persona buscarPorId(@NotNull Long id);
    Page<Persona> buscarTodos(@NotNull Pageable pageable);
    void eliminar(@NotNull Long id);
    Persona actualizar(@NotNull Long id,@NotNull PersonaGuardarCmd personaAActualizarCmd);

}
