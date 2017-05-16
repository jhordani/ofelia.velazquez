
package ofelia.model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import ofelia.model.dao.tipo_docDAO;
import ofelia.model.dto.tipo_doc;
import ofelia.model.util.JPAconnection;



/**
 *
 * @author Jeison
 */
public class tipo_docDaoImp implements tipo_docDAO {

    @Override
    public boolean AgreagarTipoDoc(tipo_doc tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<tipo_doc> ListarTipoDoc() {
        EntityManagerFactory ef = null;
        EntityManager em = null;      
        Query query=null;
        List<tipo_doc> lista=null;
             
        try {
            lista=new ArrayList<>();
            ef=JPAconnection.getInstance();
            em=ef.createEntityManager();
            query=em.createQuery("select a");
            lista=query.getResultList();
        } catch (Exception e) {
            System.out.println("error"+e.getMessage());
        } finally {
            em.close();
        }

        return lista;
    }

    @Override
    public boolean ActualizarTipoDoc(tipo_doc tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EliminarTipoDoc(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public tipo_doc BuscarTipoDocId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
