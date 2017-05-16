/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;

import java.util.List;
import ofelia.model.entity.persona;

/**
 *
 * @author Alexander_BV
 */
public interface personaDAO {

    public List<persona> listarPersonas();
    public boolean agregarPersonas(persona p);
    public boolean actualizarPersonas(persona p);
    public boolean eliminarPersonas(int id);
    public persona buscarPersona(persona p);

}
