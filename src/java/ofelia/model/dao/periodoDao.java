/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;

import java.util.List;
import ofelia.model.entity.periodo;

/**
 *
 * @author Jhordani
 */
public interface periodoDao {
    public List<periodo> listarperiodo();
    public boolean agregarPeriodo(periodo pdto);
    public boolean eliminarPeriodo(int id);
    public boolean actualizarPeriodo(periodo mdto);
}
