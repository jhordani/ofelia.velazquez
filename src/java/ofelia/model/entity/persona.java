/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Alexander_BV
 */
@Entity
public class persona {

    public persona() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idpersona;
    @Column(length = 45)
    private String nombres;
    @Column(length = 45)
    private String apellidos;
    @Column(length = 45)
    private String nro_doc;
    @Column(length = 45)
    private String fecha_nac;
    @Column(length = 45)
    private String direccion;
    private int idtipo_doc;

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdtipo_doc() {
        return idtipo_doc;
    }

    public void setIdtipo_doc(int idtipo_doc) {
        this.idtipo_doc = idtipo_doc;
    }

}
