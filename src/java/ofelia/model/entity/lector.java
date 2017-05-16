
package ofelia.model.dto;

/**
 *
 * @author Jeison
 */
public class lector {
   private int idperiodo;
   private int idpersona;
   private int idturno;
   private int idtipo;
   private String estado_habil;
   private String nivel;
   private String gradc;
   private String seccion;

    public lector() {
    }

    public lector(int idperiodo, int idpersona, int idturno, int idtipo, String estado_habil, String nivel, String gradc, String seccion) {
        this.idperiodo = idperiodo;
        this.idpersona = idpersona;
        this.idturno = idturno;
        this.idtipo = idtipo;
        this.estado_habil = estado_habil;
        this.nivel = nivel;
        this.gradc = gradc;
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(int idperiodo) {
        this.idperiodo = idperiodo;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getEstado_habil() {
        return estado_habil;
    }

    public void setEstado_habil(String estado_habil) {
        this.estado_habil = estado_habil;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getGradc() {
        return gradc;
    }

    public void setGradc(String gradc) {
        this.gradc = gradc;
    }
   
    
   
}
