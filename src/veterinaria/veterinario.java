package veterinaria;

import java.util.List;

public class veterinario extends persona {

    listaPacientes lp;
    stockProductos spr;
    
    List<String> especialidades;
    boolean trabajando;
    public veterinario(String usuario, String contraseña) {
        super(usuario, contraseña);
        this.setTipo("veterinario");
    }

    @Override
    public void trabajar() {
        String opc="";
        boolean trabajar= true;
        do{
            opc = entradaSalida.leerString(this.getTipo()+"\n[1]Alta Empleados \n[2]Vender Producto \n[3]Añadir especialidad \n[4] \n[0]SALIR");
            if("1".equals(opc))
                
            if("2".equals(opc))
                venderProducto();
            if("3".equals(opc))
                
            if("4".equals(opc))
                
            if("0".equals(opc))
                trabajar=false;
        }while(trabajar);
    }

    void venderProducto() {
        int opc;

        opc = entradaSalida.leerInt(spr.listaTodosProductos() + "\n\nSeleccione el producto:");
        
        entradaSalida.mostrarString("Prodcuto vendido");
        spr.retirarPorId(opc);
    }
    
    void añadirEspecialidad(){  
        String  esp=entradaSalida.leerString("Ingrese especialidad");
        int opc = entradaSalida.leerInt("ingresar especialidad [0]No [1]Si");
        if(opc == 1){
            especialidades.add(esp);
            entradaSalida.mostrarString("Especialidad agregada");
            }
    }
    void atenderPaciente(){
        int opc = entradaSalida.leerInt(lp.listadoEspecialidad(especialidades));
        
        lp.sacarPorIndex(opc);
        
    }
}

