package com.backend.backend;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {
    @Autowired
    private PersonaRepository repositorio; 
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarId(int id_persona) {
        return repositorio.findByid(id_persona);
    }

    @Override
    public Persona add(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona delete(int id_persona) {
        Persona p=repositorio.findByid(id_persona);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
