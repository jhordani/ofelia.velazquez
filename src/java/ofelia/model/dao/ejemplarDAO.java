/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;
import java.util.List;
import ofelia.model.entity.ejemplar;
import ofelia.model.entity.ejemplar;

/**
 *
 * @author Johannsen Vasquez
 */
public interface ejemplarDAO {
    public List<ejemplar> listarEjemplar();
    public boolean agregarEjemplar(ejemplar e);
    public boolean actualizarEjemplar (ejemplar e);
    public boolean eliminareEjemplar(int id);
    public ejemplar buscarEjemplar(ejemplar e);
}
