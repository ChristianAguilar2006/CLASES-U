import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private String codigo;
    private String nombre;
    private List<Estudiante>EstudiantesInscritos;
    private List<Profesor>ProfesorAsignado;

    public Cursos(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.EstudiantesInscritos=new ArrayList<>();
        this.ProfesorAsignado=new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return EstudiantesInscritos;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        EstudiantesInscritos = estudiantesInscritos;
    }

    public List<Profesor> getProfesorAsignado() {
        return ProfesorAsignado;
    }

    public void setProfesorAsignado(List<Profesor> profesorAsignado) {
        ProfesorAsignado = profesorAsignado;
    }

    public void AgregarUnProfesor(Profesor profesor){
        ProfesorAsignado.add(profesor);
    }
    public void Inscribirse(Estudiante estudiante){
        EstudiantesInscritos.add(estudiante);
    }
}
