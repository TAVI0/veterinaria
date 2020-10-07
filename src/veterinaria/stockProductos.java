package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class stockProductos {
    private List <producto> productos;
    
    private static stockProductos instancia;
    
    private stockProductos() {
        productos = new ArrayList();
    }
    
    public static stockProductos getInstancia(){
        if(instancia == null)
            instancia = new stockProductos();
        return instancia;
    }
    
    public String listaTodosProductos(){
        String lista = "";
        for (int i = 0; i < productos.size(); i++) {
            lista += "[" + i + "] " + productos.get(i).detalles()+"\n";
            }
        return lista;
    }
    public String listaMedicamentos(){
        String lista = "";
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getPrecio()!=0 || "medicamento".equals(productos.get(i).getCategoria())){
                lista += "[" + i + "] " + productos.get(i).detalles()+"\n";
            }
        }
        return lista;
    }
    public String listaProductos(){
        String lista = "";
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getPrecio()!=0 || "productos".equals(productos.get(i).getCategoria())){
                lista += "[" + i + "] " + productos.get(i).detalles()+"\n";
            }
        }
        return lista;
    }
    
    void agregar(producto e){
        productos.add(e);
    }
    void retirar (producto e){
        productos.remove(e);
    }
    void retirarPorId (int i){
        productos.remove(productos.get(i));
    }
    
    public List <producto> getProductos() {
        return productos;
    }
    public void setProductos(List <producto> productos) {
        this.productos = productos;
    }
}
