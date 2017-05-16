
package ofelia.model.dto;

/**
 *
 * @author Jeison
 */
public class tipo_doc {
    private int idtipo_doc;
    private String nombre;

    public tipo_doc() {
    }

    public tipo_doc(int idtipo_doc, String nombre) {
        this.idtipo_doc = idtipo_doc;
        this.nombre = nombre;
    }

    public int getIdtipo_doc() {
        return idtipo_doc;
    }

    public void setIdtipo_doc(int idtipo_doc) {
        this.idtipo_doc = idtipo_doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
