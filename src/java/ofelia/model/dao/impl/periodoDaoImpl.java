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
import ofelia.model.dao.periodoDao;
import ofelia.model.entity.periodo;
import ofelia.model.util.JPAconnection;



/**
 *
 * @author Jhordani
 */
public class periodoDaoImpl implements periodoDao{

    @Override
    public List<periodo> listarperiodo() {

    EntityManagerFactory ef=null;
        EntityManager em=null;
        Query query=null;
        List<periodo> lista=null;
        
        try {
            lista=new ArrayList<>();
            ef=JPAconnection.getInstance();
            em=ef.createEntityManager();
            query=em.createQuery("select p from periodo p");
            lista=query.getResultList();
            
        } catch (Exception e) {
            System.out.println("error al listar el periodo"+e.getMessage());
        }finally{
        ef.close();
        }
    return lista;
    
    
    }

    @Override
    public boolean agregarPeriodo(periodo pdto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPeriodo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPeriodo(periodo mdto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
