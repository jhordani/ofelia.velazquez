/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import ofelia.model.dao.proveedorDAO;
import ofelia.model.entity.proveedor;
import ofelia.model.util.JPAconnection;

/**
 *
 * @author FIORELA S
 */
public class proveedorDaoImpl implements proveedorDAO {

    private Connection cn;

    public proveedorDaoImpl() {
    }

    @Override
    public List<proveedor> listarProveedor() {
        EntityManagerFactory ef = null;
        EntityManager em = null;
        Query query = null;
        List<proveedor> lista = null;

        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select p from proveedor p");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("ERRROR al Listar Proveedor" + e.getMessage());
        } finally {
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarProveedor(proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarProveedor(proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProveedor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public proveedor buscarProveedor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
