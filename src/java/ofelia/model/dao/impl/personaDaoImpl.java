/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import ofelia.model.dao.personaDAO;
import ofelia.model.entity.persona;
import ofelia.model.util.JPAconnection;

/**
 *
 * @author Alexander_BV
 */
public class personaDaoImpl implements personaDAO {

    @Override
    public List<persona> listarPersonas() {
        EntityManagerFactory ef = null;
        EntityManager em = null;
        Query query = null;
        List<persona> lista = null;
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select p from persona p");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error listarAlumno " + e.getMessage());
        } finally {
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarPersonas(persona p) {
        boolean flat = false;
        return flat;
    }

    @Override
    public boolean actualizarPersonas(persona p) {
        boolean flat = false;
        return flat;
    }

    @Override
    public boolean eliminarPersonas(int id) {
        boolean flat = false;
        return flat;
    }

    @Override
    public persona buscarPersona(persona p) {
        return p;
    }

}
