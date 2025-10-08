public abstract class Producto implements Vendible {
    private String nombre;
    private double precio;
    private int stock;
    private int cantidad;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
          this.cantidad = 0;
    }




    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract void infoProducto();

    public void vendible(int canttidad) {
           this.stock-=canttidad;
    }

    public void  ValidacionStock(int cantidad)throws StockInvalidoException{
        if (cantidad>=this.stock)throw new StockInvalidoException("INGRESE UN STOCK VALIDO");
    }





}
