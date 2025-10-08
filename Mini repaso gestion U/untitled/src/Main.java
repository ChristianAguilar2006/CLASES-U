import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Universidad universidad=new Universidad();
        boolean seguir=true;
        var scanner= new Scanner(System.in);

        while (seguir){
            System.out.println("1) ingresar profesor ");
            System.out.println("2) ingresar estudiante ");
            System.out.println("3) ingresar curso ");
            System.out.println("4) inscribir profesor ");
            System.out.println("5) inscirbit estudinte ");
            System.out.println("6) ver inscritos");
            System.out.println("7) buscasr estudisnte ");
            System.out.println("8) salit");
            var opc=scanner.nextInt();
            scanner.nextLine();
            switch (opc){
                case 1->{
                    System.out.println("ingrese el nombre");
                    var nombre=scanner.nextLine();
                    System.out.println("ingrese edad");
                    var edad=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("ingrese cedula");
                    var cedula=scanner.nextLine();
                    System.out.println("ingrese materia imoartida");
                    var materia=scanner.nextLine();
                    Profesor profesor=new Profesor(nombre,edad,cedula,materia);
                    universidad.AgregaeProfesor(profesor);
                }
                case 2->{
                    System.out.println("ingrese el nombre");
                    var nombreE=scanner.nextLine();
                    System.out.println("ingrese edad");
                    var edadE=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("ingrese cedula");
                    var cedulaE=scanner.nextLine();
                    System.out.println("ingrese materia imoartida");
                    var carreraE=scanner.nextLine();
                    Estudiante estudiante=new Estudiante(nombreE,edadE,cedulaE,carreraE);
                    universidad.AgregarEstudiante(estudiante);
                }
                case 3->{
                    System.out.println("INGRESE EL CODIGO DEL CURSO");
                    var codigo=scanner.nextLine();
                    System.out.println("INGRESE LA MATERIA");
                    var materia=scanner.nextLine();
                    Cursos cursos=new Cursos(codigo,materia);
                    universidad.AgregarCurso(cursos);
                }
                case 4->{

                    System.out.println("INGRESE EL NOMBRE DEL CURSO");
                    var buscarC=scanner.nextLine();
                    for (Cursos cursos:universidad.getTodosLosCursos()){
                        if (cursos.getNombre().equals(buscarC)){
                            System.out.println("CURSO ENCONTRADO");
                            System.out.println("INGRESE EL NOMBRE DES PROFESOR PARA INSCRIBIR A LA CLASE");
                            var nombreP=scanner.nextLine();
                            for (Profesor profesor: universidad.getTodosLosProfesores()){
                                if (profesor.getNombre().equals(nombreP)){
                                    cursos.AgregarUnProfesor(profesor);
                                }
                            }
                        }
                    }
                }
                case 5->{

                    System.out.println("Ingrese el nombre del curso");
                    var buscarC=scanner.nextLine();
                    for (Cursos cursos:universidad.getTodosLosCursos()){
                        if (cursos.getNombre().equals(buscarC)){
                            System.out.println("CURSO ENCONTRADO");
                            System.out.println("INGRESE EL NOMBRE DEL ESTUDAONTE PARA INSCRIBIR A LA CLASE");
                            var nombreE=scanner.nextLine();
                            for (Estudiante estudiante: universidad.getTodosLosEstudiantes()){
                                if (estudiante.getNombre().equals(nombreE)){
                                    cursos.Inscribirse(estudiante);
                                }
                            }
                        }
                    }
                }
                case 6->{

                }
                case 7->{

                }
                case 8->seguir=false;

            }
        }

    }
}