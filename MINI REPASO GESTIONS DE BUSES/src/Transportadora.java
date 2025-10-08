import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    private List<Vehiculo>vehiculos;
    private List<Ruta>rutas;

    public Transportadora() {
        this.vehiculos = new ArrayList<>();
        this.rutas = new ArrayList<>();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public void IngresarVehiculos (Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    public void IngresarRutas(Ruta ruta){
        rutas.add(ruta);
    }

    public void mostrarVehiculos(){
        for (Vehiculo vehiculo:vehiculos){
            vehiculo.descripcion();
        }
    }

}
