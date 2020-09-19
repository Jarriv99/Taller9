package com.backend.backend;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImp implements CiudadService {
    @Autowired
    private CiudadRepository repositorio;

    @Override
    public List<Ciudad> listarC() {
        return repositorio.findAll();
    }
}
