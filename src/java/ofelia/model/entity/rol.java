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
 * @author Jhonny
 */
@Entity
public class rol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRol;
    
    @Column(length = 50)
    private String rol;
   

    public rol() {
    }

    public rol(int idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }
    
    

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
