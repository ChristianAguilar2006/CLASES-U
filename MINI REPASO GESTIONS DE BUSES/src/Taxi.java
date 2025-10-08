public class Taxi extends Vehiculo implements Movible{

    private Double tarifaBase;

    public Taxi(String id, String posicionX, String posicionY, int velocidadMaxima, Double tarfaBase) {
        super(id, posicionX, posicionY, velocidadMaxima);
        this.tarifaBase = tarfaBase;
    }

    public Double getTarfaBase() {
        return tarifaBase;
    }

    public void setTarfaBase(Double tarfaBase) {
        this.tarifaBase = tarfaBase;
    }

    public void descripcion (){
        System.out.println("ID: "+this.getId()+" POSICION: +"+this.getPosicionX()+" "+this.getPosicionY()+"VELOCIDAD: "+this.getVelocidadMaxima()+" PASAJEROS: "+this.tarifaBase);
    }
    public void mover(String x, String y){
        this.setPosicionX(x);
        this.setPosicionY(y);
    }
    public void distancia(String x, String y){}


}
