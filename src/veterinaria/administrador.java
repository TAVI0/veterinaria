package veterinaria;

public class administrador extends persona{
    
    stockPersonas per = stockPersonas.getInstancia();
    stockProductos pro = stockProductos.getInstancia();
    
    public administrador(String usuario, String contraseña) {
        super(usuario, contraseña);
        this.setTipo("administrador");
    }
    
    @Override
    public void trabajar() {
        String opc="";
        boolean trabajar= true;
        do{
            opc = entradaSalida.leerString(this.getTipo()+"\n[1]Alta Empleados \n[2]Agregar Producto \n[3] \n[4] \n[0]SALIR");
            if("1".equals(opc))
                altaEmpleado();
            if("2".equals(opc))
                cargarProducto();
            if("3".equals(opc))
                
            if("4".equals(opc))
                
            if("0".equals(opc))
                trabajar=false;
        }while(trabajar);
    }
    
    void altaEmpleado(){
        int opc = 0;
        int confirm =0;
        do{
        opc =entradaSalida.leerInt("Que desea agregar?\n[1]Cocinero\n[2]Camarero\n\n [0]SALIR");
        }while(opc != 0 && opc != 1 && opc != 2);
        if (opc==1){
            veterinario co = new veterinario("","");
            do{
            co.setUsuario(entradaSalida.leerString("Ingrese el usuario del Veterinario"));
            co.setContraseña(entradaSalida.leerString("Ingrese la contraseña del Veterinario"));
            
            confirm = entradaSalida.leerInt("Son los datos correctos?[0]No [1]Si");
            }while(confirm==0);
            per.agregar(co);
            entradaSalida.mostrarString("El Veterinario fue agregado");
        }
        
        if (opc==2){
            recepcionista ca = new recepcionista("","");
            do{
            ca.setUsuario(entradaSalida.leerString("Ingrese el usuario del Recepcionista"));
            ca.setContraseña(entradaSalida.leerString("Ingrese la contraseña del Recepcionista"));
            
            confirm = entradaSalida.leerInt("Son los datos correctos?[0]No [1]Si");
            }while(confirm==0);
            per.agregar(ca);
            entradaSalida.mostrarString("El Recepcionista fue agregado");
        }
    }
    
    void cargarProducto(){
        producto prod = new producto("","","", 0);
        int opc;
        prod.setNombre(entradaSalida.leerString(prod.detalles()+"\n\nIngrese nombre del producto"));
        prod.setDescripcion(entradaSalida.leerString(prod.detalles()+"\n\nIngrese descripcion del producto"));
        prod.setPrecio(entradaSalida.leerInt(prod.detalles()+"\n\nIngrese precio del Producto"));
        opc = entradaSalida.leerInt(prod.detalles()+"\n\nEs un medicamento? [0]No [1]Si");
        if(opc==0){
            prod.setCategoria("producto");
        }
        if(opc==1){
            prod.setCategoria("medicamento");
        }
        opc = entradaSalida.leerInt(prod.detalles()+"\n\nAgregar Producto? [0]No [1]Si");
        if(opc==0){
            entradaSalida.mostrarString("Saliendo");
        }
        if(opc==1){
            pro.agregar(prod);
        }
        
        
    }
    
    
}
