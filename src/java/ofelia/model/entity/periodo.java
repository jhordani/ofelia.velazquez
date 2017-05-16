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
 * @author Jhordani
 */
@Entity 
public class periodo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idperiodo;
    @Column (length = 30)
    private String periodo;

    public periodo() {
    }

    public periodo(int idperiodo, String periodo) {
        this.idperiodo = idperiodo;
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(int idperiodo) {
        this.idperiodo = idperiodo;
    }
    
    
}
