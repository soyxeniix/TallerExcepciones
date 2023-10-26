public class Platos {
    
    String nombre;
    String descripcion;
    int costo;
    int tiempoPre;
    Tipo tipo;
    public Platos(String nombre, String descripcion, int costo, int tiempoPre, Tipo tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.tiempoPre = tiempoPre;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public int getTiempoPre() {
        return tiempoPre;
    }
    public void setTiempoPre(int tiempoPre) {
        this.tiempoPre = tiempoPre;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    

    
}
