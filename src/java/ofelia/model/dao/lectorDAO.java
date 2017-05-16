
package ofelia.model.dao;

import java.util.List;
import ofelia.model.dto.lector;

/**
 *
 * @author Jeison
 */
public interface lectorDAO {
    public boolean InsertarLrctor(lector lector);
    public List<lector>ListarLector();
    public boolean ActualizaLector(lector lector);
    public boolean EliminarLector(int id);
    public boolean BuscarLectorId(int id);
}
