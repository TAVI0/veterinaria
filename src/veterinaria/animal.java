package veterinaria;

public class animal {
    private String nombre;
    private String tipo;
    private String dueño;
    private String contacto;

    public animal(String nombre, String tipo, String dueño, String contacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dueño = dueño;
        this.contacto = contacto;
    }
    
    public String detalles(){
        return this.nombre +" "+this.tipo +" "+ this.dueño +" "+ this.contacto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
    
}
