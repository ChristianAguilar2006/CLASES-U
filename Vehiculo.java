public abstract class Vehiculo implements Manteniminto {

    private String marca;
    private String modelo;
    private int anio;
    private boolean condicion=false;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public void registrarMantenimiento(){
       if (condicion){
           System.out.println("YA ESTA EN MANTENIMIENTO ESTE CARRO");
       }else {
           this.condicion=true;
           System.out.println("EN REPARACION ESTADO: TRUE");
       }

    }
    public void finalizarMantenimiento(){
        this.condicion=false;
    }
    public abstract void informacion();

    public void AñoValido(int año)throws AñoValido{
        if (año<=1950){
            throw new AñoValido("Ingrese un año valido");
        }
    }

}
