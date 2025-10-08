import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto>TodosLosProductos;
    private List<Cliente>TodosLosClientes;

    public Tienda() {
        TodosLosProductos = new ArrayList<>();
        TodosLosClientes = new ArrayList<>();
    }

    public List<Producto> getTodosLosProductos() {
        return TodosLosProductos;
    }

    public void setTodosLosProductos(List<Producto> todosLosProductos) {
        TodosLosProductos = todosLosProductos;
    }

    public List<Cliente> getTodosLosClientes() {
        return TodosLosClientes;
    }

    public void setTodosLosClientes(List<Cliente> todosLosClientes) {
        TodosLosClientes = todosLosClientes;
    }

    public void registrarUnProductos(Producto producto){
        TodosLosProductos.add(producto);
        System.out.println("PRODUCTO REGISTRADO CON EXITO");
    }
    public void registrarUnCliente(Cliente cliente){
        TodosLosClientes.add(cliente);
        System.out.println("CLIENTE REGISTRADO CON EXITO");
    }

    public void mostrarClientes(){
        for (Cliente cliente:TodosLosClientes){
            cliente.infoCliente();
        }
    }
    public void mostrarProductos(){
        for (Producto producto:TodosLosProductos){
            producto.infoProducto();
        }
    }



}
