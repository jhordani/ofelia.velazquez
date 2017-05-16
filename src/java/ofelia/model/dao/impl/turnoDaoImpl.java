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
import ofelia.model.DAO.turnoDAO;
import ofelia.model.entity.turno;
import ofelia.model.util.JPAconnection;


/**
 *
 * @author Jhonny
 */
public class turnoDaoImpl implements turnoDAO{
    
    private Connection cn;
    
    public turnoDaoImpl(){
    
    }

    @Override
    public List<turno> listarTurno() {
    
       EntityManagerFactory ef = null;
        EntityManager em = null;
        Query query = null;
        List<turno>lista = null;
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select t from turno t");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar rol"+e.getMessage());
        }finally{
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarRol(turno tDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarRol(turno tDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRol(int tDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
