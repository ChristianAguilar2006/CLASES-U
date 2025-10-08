public class Comestibles extends Producto {
    private double nivelColesterol;

    public Comestibles(String nombre, double precio, int stock, double nivelColesterol) {
        super(nombre, precio, stock);
        this.nivelColesterol=nivelColesterol;
    }

    public double getNivelColesterol() {
        return nivelColesterol;
    }
    public void setNivelColesterol(double nivelColesterol) {
        this.nivelColesterol = nivelColesterol;
    }


    public void infoProducto(){
        System.out.println("NOMBRE: "+this.getNombre()+"PRECIO: "+this.getPrecio()+" STOCK: "+this.getStock()+" NIVEL DE COLESTEROL"+this.nivelColesterol);
    }


}
