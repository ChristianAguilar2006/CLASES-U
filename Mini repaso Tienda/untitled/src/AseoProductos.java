public class AseoProductos extends Producto{
  private String registroSanitario;

    public AseoProductos(String nombre, double precio, int stock, String registroSanitario) {
        super(nombre, precio, stock);
        this.registroSanitario = registroSanitario;
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }

    public void infoProducto(){
        System.out.println("NOMBRE: "+this.getNombre()+"PRECIO: "+this.getPrecio()+" STOCK: "+this.getStock()+" REGISTRO SANITARIO"+this.registroSanitario);
    }

}
