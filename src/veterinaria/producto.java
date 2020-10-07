package veterinaria;

public class producto {

    private String nombre;
    private String descripcion;
    private String categoria;
    private int precio;

    public producto(String descripcion, String categoria, String nombre, int precio) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.nombre = nombre;
    }

    String detalles() {
        return this.nombre +" "+ this.categoria +" "+ this.categoria;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
