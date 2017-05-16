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
import ofelia.model.dao.EditorialDAO;
import ofelia.model.entity.Editorial;
import ofelia.model.util.JPAconnection;

/**
 *
 * @author ferdi
 */
public class EditorialDaoImpl implements EditorialDAO{

    @Override
    public List<Editorial> listarEditorial() {
        EntityManagerFactory ef= null;
        EntityManager em = null;
        Query query = null;
        List<Editorial> lista = null;
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select e from editorial e");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error listarEditorial " + e.getMessage());
        } finally {
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarEditorial(Editorial e) {
    boolean flat = false;
        return flat;
    }

    @Override
    public boolean actualizarEditorial(Editorial e) {
     boolean flat = false;
        return flat;
    }

    @Override
    public boolean eliminarPersonas(int id) {
     boolean flat = false;
        return flat;
    }

    @Override
    public Editorial buscarEditorial(Editorial e) {
        return e;
    }
    
}
