/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofelia.model.dao;

import java.util.List;
import ofelia.model.entity.proveedor;

/**
 *
 * @author FIORELA S
 */
public interface proveedorDAO {
   
    
    public List<proveedor> listarProveedor();
    public boolean agregarProveedor(proveedor proveedor);
    public boolean actualizarProveedor(proveedor proveedor);
    public boolean eliminarProveedor(int id);
    public proveedor buscarProveedor(int id);

}
