package ofelia.model.entity;

/**
 *
 * @author user
 */
public class libro {
    
    private int idlibro;
    private int ideditorial;
    private String titulo;
    private String  year_publicacion;
    private String paginas;
    private int cantidad;
    private double precio;
    private int idpersona_autor;
    private int idcategria;

    public libro() {
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getYear_publicacion() {
        return year_publicacion;
    }

    public void setYear_publicacion(String year_publicacion) {
        this.year_publicacion = year_publicacion;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdpersona_autor() {
        return idpersona_autor;
    }

    public void setIdpersona_autor(int idpersona_autor) {
        this.idpersona_autor = idpersona_autor;
    }

    public int getIdcategria() {
        return idcategria;
    }

    public void setIdcategria(int idcategria) {
        this.idcategria = idcategria;
    }
    
    
}
