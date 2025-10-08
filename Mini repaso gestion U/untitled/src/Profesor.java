import java.util.ArrayList;
import java.util.List;

public class Profesor extends Personas{

    private String materia;
    private List<Cursos>cursoImpartido;

    public Profesor(String nombre, int edad, String cedula, String materia) {
        super(nombre, edad, cedula);
        this.materia = materia;
        this.cursoImpartido=new ArrayList<>();
    }

    public void DescripcionPersona(){
        System.out.println("PROFESOR: "+this.getNombre()+" EDAD: "+this.getEdad()+" CEDULA: "+this.getCedula()+" MATERIA: "+this.materia);
    }

    public void AgregarMateria(Cursos cursos){
        cursoImpartido.add(cursos);
    }
}
