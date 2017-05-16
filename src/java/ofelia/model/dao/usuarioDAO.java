package ofelia.model.dao;

import ofelia.model.dao.*;
import java.util.List;
import ofelia.model.entity.usuario;
/**
 *
 * @author user
 */
public interface usuarioDAO {
    public List<usuario> listarUsuarios();
    public boolean agregarUsuarios(usuario udto);
    public boolean eliminarUsuarios(int id);
    public boolean actualizarUsuarios(usuario udto);
}
