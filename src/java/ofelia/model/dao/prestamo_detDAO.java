/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;

/**
 *
 * @author Johannsen Vasquez
 */
import java.util.List;
import ofelia.model.entity.prestamo_det;
import ofelia.model.entity.prestamo_det;

public interface prestamo_detDAO {
   
    public List<prestamo_det> listarPrestamo_det();
    public boolean agregarPrestamodet(prestamo_det p);
    public boolean actualizarPrestamo_det(prestamo_det p);
    public boolean eliminarPrestamo_det(int id);
    public prestamo_det buscarPrestamo_det(prestamo_det p);
}
