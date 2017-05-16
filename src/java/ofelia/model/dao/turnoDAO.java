/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.DAO;

import java.util.List;
import ofelia.model.entity.turno;

/**
 *
 * @author Jhonny
 */
public interface turnoDAO {
    public List<turno>listarTurno();
    public boolean agregarRol(turno tDTO);
    public boolean editarRol (turno tDTO);
    public boolean eliminarRol (int tDTO);
}
