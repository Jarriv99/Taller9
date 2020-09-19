package com.backend.backend;

import javax.persistence.*;

@Entity
@Table (name = "persona")
public class Persona {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private int id_persona;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tipdoc")
    private TipoDocumento fk_tipodocumento;
    @Column
    private String documento;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nomre_ciu")
    private Ciudad lugaresidencia;
    @Column
    private String email;
    @Column
    private int telefono;
    @Column
    private String usuario;
    @Column
    private String contraseña;

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getfk_tipodocumento() {
        return fk_tipodocumento;
    }

    public void setfk_tipodocumento(TipoDocumento fk_tipodocumento) {
        this.fk_tipodocumento = fk_tipodocumento;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Ciudad getLugaresidencia() {
        return lugaresidencia;
    }

    public void setLugaresidencia(Ciudad lugaresidencia) {
        this.lugaresidencia = lugaresidencia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseñA() {
        return this.contraseña;
    }

    public void setContraseñA(String contraseña) {
        this.contraseña = contraseña;
    }

    
    

}


