package com.backend.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/Personas"})
public class Controlador {
    
    @Autowired
    PersonaService service;
    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }
    @Autowired
    CiudadService serviceC;
    @GetMapping("/Ciudades")
    public List<Ciudad>listarC(){
        return serviceC.listarC();
    
    }
    @Autowired
    TipoDocumentoService serviceT;
    @GetMapping("/Tipos")
    public List<TipoDocumento>listarT(){
        return serviceT.listarT();
    }
    
    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
    @GetMapping(path = {"/{id_persona}"})
    public Persona listarId(@PathVariable("id_persona") int id_persona){
        return service.listarId(id_persona);
    }
    @PutMapping(path = {"/{id_persona}"})
    public Persona editar(@RequestBody Persona p, @PathVariable("id_persona") int id_persona){
        p.setId_persona(id_persona);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id_persona}"})
    public Persona delete(@PathVariable("id_persona") int id_persona){
        return service.delete(id_persona);
    }

}
