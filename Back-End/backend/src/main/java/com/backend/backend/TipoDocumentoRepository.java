package com.backend.backend;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface TipoDocumentoRepository extends Repository<TipoDocumento, Integer> {
    
    List<TipoDocumento> findAll();
}
