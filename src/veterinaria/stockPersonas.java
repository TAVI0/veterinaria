package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class stockPersonas {
    
    private List <persona> empleados;   

    private static stockPersonas instancia;
    
    private stockPersonas() {
        empleados = new ArrayList();
    }
    
    
    public static stockPersonas getInstancia(){
        if(instancia == null)
            instancia = new stockPersonas();
        return instancia;
    }
    
    
    void agregar(persona e){
        getEmpleados().add(e);
    }
    public List <persona> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List <persona> empleados) {
        this.empleados = empleados;
    }
    
    persona selectUsuario(String user, String contra){
        persona empleado = null;
        for (persona empl : empleados) {
            if(empl.getUsuario().equals(user) && empl.getContraseña().equals(contra))
                empleado=empl;
        }
        return empleado;
    }
    
    boolean buscarUsuario(String user){
        for (persona empl : empleados) {
            if(empl.getUsuario().equals(user))
                return true;       
        }return false;
    }
    boolean comparaContraseña(String user, String contra){
        for (persona empl : empleados) {
            if(empl.getUsuario().equals(user) && empl.getContraseña().equals(contra)) {          
                return true;
            }          
        }return false;
    }
    
    public String listaPersonas(){
        String lista="";
        for (persona pr : empleados) {
            lista+=pr.getUsuario()+"\n";
        }
    return lista;   
    }
    
}
