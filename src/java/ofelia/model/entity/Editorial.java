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
 * @author ferdi
 */
@Entity
public class Editorial {

    public Editorial() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int editorial;
    int idlugar_procedencia;
    @Column(length = 45)
    String nomre;

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public int getIdlugar_procedencia() {
        return idlugar_procedencia;
    }

    public void setIdlugar_procedencia(int idlugar_procedencia) {
        this.idlugar_procedencia = idlugar_procedencia;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }
}
