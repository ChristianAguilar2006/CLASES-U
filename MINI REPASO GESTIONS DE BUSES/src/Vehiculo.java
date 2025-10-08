import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo implements Movible {

    private String id;
    private String posicionX,posicionY;
    private int velocidadMaxima;
    private List<Ruta>rutasAsignadas;


    public Vehiculo(String id, String posicionX, String posicionY, int velocidadMaxima) {
        this.id = id;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.velocidadMaxima = velocidadMaxima;
        this.rutasAsignadas=new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(String posicionX) {
        this.posicionX = posicionX;
    }

    public String getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(String posicionY) {
        this.posicionY = posicionY;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    public abstract void descripcion ();


}
