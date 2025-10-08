import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Personas  {

    private String carrera;
    private List<Cursos>cursosInscritos;

    public Estudiante(String nombre, int edad, String cedula, String carrera) {
        super(nombre, edad, cedula);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Cursos> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<Cursos> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }


    public void DescripcionPersona(){
        System.out.println("ESTUDIANTE: "+this.getNombre()+" EDAD: "+this.getEdad()+" CEDULA: "+this.getCedula()+" CARREA: "+this.getCarrera());
    }






}
