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
import ofelia.model.dao.tipoDAO;
import ofelia.model.entity.tipo;
import ofelia.model.util.JPAconnection;

/**
 *
 * @author FIORELA S
 */
public class tipoDaoImpl implements tipoDAO{

    @Override
    public List<tipo> listarTipo() {
        EntityManagerFactory ef = null;
        EntityManager em=null;
        Query query=null;
        List<tipo> lista = null;
        
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em=ef.createEntityManager();
            query = em.createQuery("select t from tipo t");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("ERROR al LISTAR TIPO "+ e.getMessage());
        }finally{
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarTipo(tipo tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarTipo(tipo tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarTipo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscarTipo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
