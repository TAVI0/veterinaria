package veterinaria;

public class Veterinaria {

    public static void main(String[] args) {
        stockPersonas pr= stockPersonas.getInstancia();
        
        persona per = null;

        
        if(pr.getEmpleados().isEmpty()){
            administrador adm = new administrador("Juan Carlos", "123");
            adm.setUsuario(entradaSalida.leerString("Ingrese nombre del Admin"));
            adm.setContraseña(entradaSalida.leerPassword("Ingrese contraseña del Admin"));
            
            pr.agregar(adm);
        }
                 
        Sistema sist =new Sistema();
        do{
            do{
                per = sist.arranque(pr);
            }while(per==null);
        
            per.trabajar();
            entradaSalida.mostrarString("Hasta pronto!");
        }while (true);            
            
        }
        
    }
    

