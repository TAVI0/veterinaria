
package veterinaria;

public abstract class persona {
    private String usuario;
    private String contraseña;  
    private String tipo;
    
    public persona(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public abstract void trabajar();
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String nombre) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
}
