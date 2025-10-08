import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombreCliente;
    private List<Producto>listaProductosComprados;

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.listaProductosComprados=new ArrayList<>();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void infoCliente(){
        System.out.println("NOMBRE: "+this.nombreCliente);
    }
    public void venderProducto(Producto producto,int cantidad) throws StockInvalidoException{
        try {
            producto.ValidacionStock(cantidad);
            listaProductosComprados.add(producto);
            producto.vendible(cantidad);
        } catch (StockInvalidoException e) {
            throw new StockInvalidoException("NO VALIDO");
        }

    }

    public void mostrarVentas(){
for (Producto producto:listaProductosComprados){
    System.out.println(producto);
}
    }


}
