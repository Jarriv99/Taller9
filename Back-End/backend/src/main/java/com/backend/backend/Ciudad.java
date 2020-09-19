package com.backend.backend;

import javax.persistence.*;

@Entity
@Table(name ="ciudad")
public class Ciudad {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ciudad;
    @Column
    private String nombre_ciu;
    @Column
    private String descripcion_c;   
    @Column
    public int getId_ciudad() {
        return this.id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre_ciu() {
        return this.nombre_ciu;
    }

    public void setNombre_ciu(String nombre_ciu) {
        this.nombre_ciu = nombre_ciu;
    }

    public String getDescripcion_c() {
        return this.descripcion_c;
    }

    public void setDescripcion_c(String descripcion_c) {
        this.descripcion_c = descripcion_c;
    }

}
