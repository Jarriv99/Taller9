package com.backend.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoServiceImp implements TipoDocumentoService {
    
    @Autowired
    private TipoDocumentoRepository repositorio;

    @Override
    public List<TipoDocumento> listarT() {

        return repositorio.findAll();
    }

}
