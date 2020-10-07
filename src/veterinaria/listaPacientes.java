package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class listaPacientes {

    private List<animal> pacientes;

    private static listaPacientes instancia;

    private listaPacientes() {
        pacientes = new ArrayList();
    }

    public static listaPacientes getInstancia() {
        if (instancia == null) {
            instancia = new listaPacientes();
        }
        return instancia;
    }

    void agregar(animal a) {
        getPacientes().add(a);
    }
    void sacar(animal a) {
        getPacientes().remove(a);
    }
    void sacarPorIndex(int i) {
        getPacientes().remove(i);
    }

    public String listadoTotal() {
        String lista = "";
        for (int i = 0; i < pacientes.size(); i++) {
            lista += "[" + i + "] " + pacientes.get(i).detalles() + "\n";
        }
        return lista;
    }

    public String listadoEspecialidad(List<String> esp) {
        String lista = "";
        for (int i = 0; i < pacientes.size(); i++) {
            for (int j = 0; j < esp.size(); j++){ 
                if(pacientes.get(i).getTipo().equals(esp.get(j)))
                    lista += "[" + i + "] " + pacientes.get(i).detalles() + "\n";
        }}
        return lista;
    }
    
    public List<animal> getPacientes() {
        return pacientes;
    }
    public void setPacientes(List<animal> pacientes) {
        this.pacientes = pacientes;
    }

}
