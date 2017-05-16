/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;

import java.util.List;
import ofelia.model.entity.Editorial;

/**
 *
 * @author ferdi
 */
public interface EditorialDAO {
    public List<Editorial> listarEditorial();
    public boolean agregarEditorial(Editorial e);
    public boolean actualizarEditorial(Editorial e);
    public boolean eliminarPersonas(int id);
    public Editorial buscarEditorial(Editorial e);
}
