
package ofelia.model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ofelia.model.dao.lectorDAO;
import ofelia.model.dto.lector;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import ofelia.model.util.JPAconnection;

/**
 *
 * @author Jeison
 */
public class lectorDaoImp implements lectorDAO{

    @Override
    public boolean InsertarLrctor(lector lector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<lector> ListarLector() {
        EntityManagerFactory ef = null;
        EntityManager em = null;      
        Query query=null;
        List<lector> lista=null;
             
        try {
            lista=new ArrayList<>();
            ef=JPAconnection.getInstance();
            em=ef.createEntityManager();
            
            query=em.createQuery("");
            lista=query.getResultList();
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        } finally {
            em.close();
        }

        return lista;
    }

    @Override
    public boolean ActualizaLector(lector lector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EliminarLector(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean BuscarLectorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
