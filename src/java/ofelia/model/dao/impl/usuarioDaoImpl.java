package ofelia.model.dao.impl;

import ofelia.model.dao.impl.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.Query;
import ofelia.model.entity.usuario;
import ofelia.model.dao.usuarioDAO;
import ofelia.model.util.JPAconnection;
import ofelia.model.util.conexion;



/**
 *
 * @author user
 */
public class usuarioDaoImpl implements usuarioDAO{

    private Connection cn;
    
    @Override
    public List<usuario> listarUsuarios() {
        EntityManagerFactory ef = null;
        EntityManager em = null;
        Query query = null;
        List<usuario> lista = null;
//        List<usuario> lista = null;
//        PreparedStatement st = null;
//        ResultSet rs = null;
//        String query = "select idUsuario, Usuario , Clave, idRol, idPersona from usuario";
//        usuario udto = null;
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select u from usuario u");
            lista = query.getResultList();
//            lista = new ArrayList<>();
//            cn = Conexion.getConexionMySQL();
//            st = cn.prepareStatement(query);
//            rs = st.executeQuery();
//            while (rs.next()) {
//                udto = new usuario();
//                udto.setIdusuario(rs.getInt("idUsuario"));
//                udto.setUsuario(rs.getString("Usuario"));
//                udto.setClave(rs.getString("Clave"));
//                udto.setIdrol(rs.getInt("idRol"));
//                udto.setIdpersona(rs.getInt("idPersona"));
//                lista.add(udto);
//            }
//            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR listarUsuario"+e.getMessage());
//            try {
//                cn.close();
//                System.out.println("ERROR listarUsuario: " + e.getMessage());
//            } catch (SQLException ex) {
//            }
        }finally{
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarUsuarios(usuario udto) {
        boolean flat = false;
        EntityManagerFactory ef = null;
        EntityManager em = null;
        EntityTransaction et = null;
        Query query = null;
//        PreparedStatement st = null;
//        String query = "insert into usuario (Usuario, Clave, idRol, idPersona) values(?,?,?,?)";
        try {
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            et = em.getTransaction();
            query = em.createQuery("insert into usuario values (?,?,?,?)");
            em.getTransaction().begin();
            //et = query.setFirstResult(1, em.get);
            flat = true;
//            cn = Conexion.getConexionMySQL();
//            st = cn.prepareStatement(query);
//            st.setString(1, udto.getUsuario());
//            st.setString(2, udto.getClave());
//            st.setInt(3, udto.getIdrol());
//            st.setInt(4, udto.getIdpersona());
//            st.executeUpdate();
//            cn.close();
//            flat = true;
        } catch (Exception e) {
            System.out.println("ERROR AL CORREGIR"+e.getMessage());
//            flat = false;
//            try {
//                cn.close();
//                System.out.println("ERROR agregarPersona: " + e.getMessage());
//            } catch (SQLException ex) {
//            }
        }finally{
            em.close();
        }
        return flat;
    }

    @Override
    public boolean eliminarUsuarios(int id) {
        boolean flat = false;
        PreparedStatement st = null;
        String query = "delete from usuario where idUsuario= ? ";
        try {
            cn = conexion.conectar();
            st = cn.prepareStatement(query);
            st.setInt(1, id);
            st.executeUpdate();
            cn.close();
            flat = true;
        } catch (Exception e) {
            flat = false;
            try {
                cn.close();
                System.out.println("ERROR eliminarPersona: " + e.getMessage());
            } catch (SQLException ex) {
            }
        }
        return flat;
    }

    @Override
    public boolean actualizarUsuarios(usuario udto) {
        boolean flat = false;
        PreparedStatement st = null;
        String query = "update usuario set Usuario=? , Clave=?, idRol=?, idPersona=? where idUsuario =? ";
        try {
            cn = conexion.conectar();
            st = cn.prepareStatement(query);
            st.setInt(5, udto.getIdusuario());
            st.setString(1, udto.getUsuario());
            st.setString(2, udto.getClave());
            st.setInt(3, udto.getIdrol());
            st.setInt(4, udto.getIdpersona());
            
            st.executeUpdate();
            cn.close();
            flat = true;
        } catch (Exception e) {
            flat = false;
            try {
                cn.close();
                System.out.println("ERROR actualizarPersona: " + e.getMessage());
            } catch (SQLException ex) {
            }
        }
        return flat;
    }
    
}
