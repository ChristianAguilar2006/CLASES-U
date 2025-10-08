import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private List<Estudiante>TodosLosEstudiantes;
    private List<Profesor>TodosLosProfesores;
    private List<Cursos>TodosLosCursos;

    public Universidad() {
        TodosLosEstudiantes = new ArrayList<>();
        TodosLosProfesores = new ArrayList<>();
        TodosLosCursos = new ArrayList<>();
    }

    public List<Estudiante> getTodosLosEstudiantes() {
        return TodosLosEstudiantes;
    }

    public void setTodosLosEstudiantes(List<Estudiante> todosLosEstudiantes) {
        TodosLosEstudiantes = todosLosEstudiantes;
    }

    public List<Profesor> getTodosLosProfesores() {
        return TodosLosProfesores;
    }

    public void setTodosLosProfesores(List<Profesor> todosLosProfesores) {
        TodosLosProfesores = todosLosProfesores;
    }

    public List<Cursos> getTodosLosCursos() {
        return TodosLosCursos;
    }

    public void setTodosLosCursos(List<Cursos> todosLosCursos) {
        TodosLosCursos = todosLosCursos;
    }

    public void AgregaeProfesor(Profesor profesor){
        TodosLosProfesores.add(profesor);
    }
    public void AgregarEstudiante(Estudiante estudiante){
        TodosLosEstudiantes.add(estudiante);
    }
    public void AgregarCurso(Cursos cursos){
        TodosLosCursos.add(cursos);
    }

    public void BuscarEstudiantes(){
      //  for ()
    }


}
