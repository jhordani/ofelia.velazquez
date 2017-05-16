package ofelia.model.dao;

import java.util.List;
import ofelia.model.entity.libro;

/**
 *
 * @author user
 */
public interface libroDAO {
    
public List<libro> listarLibros();
    public boolean agregarLibros(libro lib);
    public boolean eliminarLibros(int id);
    public boolean actualizarLibros(libro lib);
    public libro buscarLibros(libro lib);
}
