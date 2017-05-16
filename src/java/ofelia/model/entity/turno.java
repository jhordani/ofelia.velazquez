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
public class turno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idturno;
    @Column(length = 50)
    private String turno;

    public turno() {
    }

    public turno(int idturno, String turno) {
        this.idturno = idturno;
        this.turno = turno;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    
}
