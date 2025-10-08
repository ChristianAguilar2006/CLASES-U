public class Bus extends Vehiculo implements Movible{
    private int capacidadPasajeros;

    public Bus(String id, String posicionX, String posicionY, int velocidadMaxima, int capacidadPasajeros) {
        super(id, posicionX, posicionY, velocidadMaxima);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void descripcion (){
        System.out.println("ID: "+this.getId()+" POSICION: +"+this.getPosicionX()+" "+this.getPosicionY()+"VELOCIDAD: "+this.getVelocidadMaxima()+" PASAJEROS: "+this.capacidadPasajeros);
    }
    public void mover(String x, String y){
        this.setPosicionX(x);
        this.setPosicionY(y);
    }
    public void distancia(String x, String y){}


}
