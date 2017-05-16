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
import ofelia.model.dao.prestamo_detDAO;
import ofelia.model.entity.persona;
import ofelia.model.entity.prestamo_det;
import ofelia.model.util.JPAconnection;

/**
 *
 * @author Johannsen Vasquez
 */
public class prestamo_detDaoImpl implements prestamo_detDAO {

    @Override
    public List<prestamo_det> listarPrestamo_det() {
        EntityManagerFactory ef = null;
        EntityManager em = null;
        Query query = null;
        List<prestamo_det> lista = null;
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select p from prestamo_det p");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error listaPrestamo_det " + e.getMessage());
        } finally {
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarPrestamodet(prestamo_det p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPrestamo_det(prestamo_det p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPrestamo_det(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public prestamo_det buscarPrestamo_det(prestamo_det p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
