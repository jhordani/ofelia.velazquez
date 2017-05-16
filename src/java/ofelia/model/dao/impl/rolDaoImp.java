/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import ofelia.model.dao.rolDao;
import ofelia.model.entity.rol;
import ofelia.model.util.JPAconnection;
import ofelia.model.util.conexion;


/**
 *
 * @author Jhonny
 */
public class rolDaoImp implements rolDao {

    private Connection cn;

    public rolDaoImp() {
    }

    @Override
    public List<rol> listarRol() {
        EntityManagerFactory ef = null;
        EntityManager em = null;
        Query query = null;
        List<rol>lista = null;
        try {
            lista = new ArrayList<>();
            ef = JPAconnection.getInstance();
            em = ef.createEntityManager();
            query = em.createQuery("select r from rol r");
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar rol"+e.getMessage());
        }finally{
            em.close();
        }
        return lista;
    }

    @Override
    public boolean agregarRol(rol rDTO) {

        boolean flag = false;
        PreparedStatement st;
        String query = "INSERT INTO rol (rol) VALUES (?)";

        try {
            cn = conexion.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, rDTO.getRol());

            st.executeUpdate();

            cn.close();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error Agregar: " + e.getMessage());
            try {
                cn.rollback();
                cn.close();
            } catch (Exception ex) {
            }
            flag = false;
            System.out.println("Erro. No se pudo Agregar un rol");
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception ex) {
                }
            }
        }
        return flag;
    }

    @Override
    public boolean editarRol(rol rDTO) {

        boolean flag = false;
        PreparedStatement st;
        String query = "UPDATE rol SET rol = ? where idRol=?";

        try {
            cn = conexion.conectar();
            st = cn.prepareStatement(query);
            st.setString(1, rDTO.getRol());
            st.setInt(2, rDTO.getIdRol());
            st.executeUpdate();
            cn.close();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error Actualizar: " + e.getMessage());
            try {
                cn.rollback();
                cn.close();
            } catch (Exception ex) {
            }
            flag = false;
            System.out.println("Erro. No se pudo Actualizar");
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception ex) {
                }
            }
        }
        return flag;
    }

    @Override
    public boolean eliminarRol(int id) {

        boolean flag = false;
        PreparedStatement st;
        String query = "DELETE FROM rol WHERE idRol = ?";

        try {
            cn = conexion.conectar();
            st = cn.prepareStatement(query);
            st.setInt(1, id);
            st.executeUpdate();
            cn.close();
            flag = true;
        } catch (Exception e) {
            System.out.println("Error Eliminar: " + e.getMessage());
            try {
                cn.rollback();
                cn.close();
            } catch (Exception ex) {
            }
            flag = false;
            System.out.println("Erro. No se pudo Eliminar");
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception ex) {
                }
            }
        }
        return flag;
    }

}
