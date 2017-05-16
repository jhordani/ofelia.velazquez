/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;

import java.util.List;
import ofelia.model.entity.rol;

/**
 *
 * @author Jhonny
 */
public interface rolDao {
    
    public List<rol> listarRol();
    public boolean agregarRol(rol rDTO);
    public boolean editarRol(rol rDTO);
    public boolean eliminarRol(int id);
    
}
