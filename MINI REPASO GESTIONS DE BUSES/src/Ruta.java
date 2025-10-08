import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private String posicionX, posicionY;
    private List<Vehiculo> vehiculosAsignados;

    public Ruta(String posicionY, String posicionX) {
        this.posicionY = posicionY;
        this.posicionX = posicionX;
        this.vehiculosAsignados = new ArrayList<>();
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

    public List<Vehiculo> getVehiculosAsignados() {
        return vehiculosAsignados;
    }

    public void setVehiculosAsignados(List<Vehiculo> vehiculosAsignados) {
        this.vehiculosAsignados = vehiculosAsignados;
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.add(vehiculo);
        System.out.println("VEHICULO ASIGNADO");

    }

    public void verRutas(){
        System.out.println("PRINCIPAL: "+this.posicionX+" SECUNDARIA: "+this.posicionY);
    }


}
