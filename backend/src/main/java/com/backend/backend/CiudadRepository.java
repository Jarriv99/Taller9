package com.backend.backend;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface CiudadRepository extends Repository<Ciudad, Integer>{

    List<Ciudad>findAll();
    
}
