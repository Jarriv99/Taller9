package com.backend.backend;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonaRepository extends Repository<Persona, Integer> {

    List<Persona>findAll();
    Persona findByid(int id_persona);
    Persona save(Persona p);
    void delete(Persona p);
}
