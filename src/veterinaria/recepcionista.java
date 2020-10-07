package veterinaria;

public class recepcionista extends persona{
    
    listaPacientes lp;
    stockProductos spr;
    
    public recepcionista(String usuario, String contraseña) {
        super(usuario, contraseña);
        this.setTipo("recepcionista");
    }
    
    @Override
    public void trabajar() {
       String opc="";
        boolean trabajar= true;
        do{
            opc = entradaSalida.leerString(this.getTipo()+"\n[1]Agregar Paciente \n[2]Vender Producto \n[3] \n[4] \n[0]SALIR");
            if("1".equals(opc))
              agregarPaciente();
            if("2".equals(opc))
                venderProducto();
            if("3".equals(opc))
                
            if("4".equals(opc))
                
            if("0".equals(opc))
                trabajar=false;
        }while(trabajar);
    }
    
    void agregarPaciente(){
        animal paci = new animal("", "", "", "");
        
        paci.setNombre(paci.detalles()+"\n\nIngrese nombre del animal");
        paci.setTipo(paci.detalles()+"\n\nIngrese tipo del animal");
        paci.setDueño(paci.detalles()+"\n\nIngrese dueño del animal");
        paci.setContacto(paci.detalles()+"\n\nIngrese contacto del dueño");
        
        }
    void venderProducto(){
        int opc;
        boolean verif;
        
        do{
            verif = false;
            opc = entradaSalida.leerInt(spr.listaProductos()+"\n\nSeleccione el producto:");
            if(!spr.getProductos().get(opc).getCategoria().equals("producto")){
                verif=true;
                entradaSalida.mostrarString("ACCION NO VALIDA");
            }else{
                spr.retirarPorId(opc);
            }
            
                
        }while(verif);
    }

}
