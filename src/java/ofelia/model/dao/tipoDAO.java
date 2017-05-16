/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;

import java.util.List;
import ofelia.model.entity.tipo;

/**
 *
 * @author FIORELA S
 */
public interface tipoDAO {
    
    public List<tipo> listarTipo();
    public boolean agregarTipo (tipo tipo);
    public boolean actualizarTipo(tipo tipo);
    public boolean eliminarTipo(int id);
    public boolean buscarTipo(int id);

}
