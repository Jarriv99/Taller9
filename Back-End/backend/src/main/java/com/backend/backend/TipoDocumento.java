package com.backend.backend;

import javax.persistence.*;


@Entity
@Table(name = "tipodocumento")
public class TipoDocumento {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipdoc;
    @Column
    private String nombre_doc;
    @Column
    private String descripcion_td;
    @Column
    public int getId_tipdoc() {
        return this.id_tipdoc;
    }

    public void setId_tipdoc(int id_tipdoc) {
        this.id_tipdoc = id_tipdoc;
    }

    public String getNombre_doc() {
        return this.nombre_doc;
    }

    public void setNombre_doc(String nombre_doc) {
        this.nombre_doc = nombre_doc;
    }

    public String getDescripcion_td() {
        return this.descripcion_td;
    }

    public void setDescripcion_td(String descripcion_td) {
        this.descripcion_td = descripcion_td;
    }


}
