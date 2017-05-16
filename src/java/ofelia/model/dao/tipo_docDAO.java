
package ofelia.model.dao;

import java.util.List;
import ofelia.model.dto.tipo_doc;

/**
 *
 * @author Jeison
 */
public interface tipo_docDAO {
    public boolean AgreagarTipoDoc(tipo_doc tipo);
    public List<tipo_doc>ListarTipoDoc();
    public boolean ActualizarTipoDoc(tipo_doc tipo);
    public boolean EliminarTipoDoc(int id);
    public tipo_doc BuscarTipoDocId(int id);
}
