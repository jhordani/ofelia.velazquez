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
import ofelia.model.dao.ejemplarDAO;
import ofelia.model.entity.ejemplar;
import ofelia.model.entity.persona;
import ofelia.model.util.JPAconnection;

/**
 *
 * @author Johannsen Vasquez
 */
public class ejemplarDaoImpl implements ejemplarDAO {

    @Override
    public List<ejemplar> listarEjemplar() {
        EntityManagerFactory ef = null;
        EntityManager em = null;
        Query query = null;
        List<ejemplar> lista = null;
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select e from ejemplar e");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error listarEjemplar " + e.getMessage());
        } finally {
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarEjemplar(ejemplar e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarEjemplar(ejemplar e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminareEjemplar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ejemplar buscarEjemplar(ejemplar e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
