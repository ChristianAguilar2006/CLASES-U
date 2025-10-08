
//Enunciado: Gestión de Vehículos en un Taller
//Funcionalidades
//	1.	Registrar un vehículo:
//	•	Elegir Auto o Moto.
//	•	Ingresar todos sus datos.
//	2.	Mostrar vehículos:
//	•	Mostrar todos los vehículos registrados.
//	•	Mostrar atributos específicos según tipo (Auto o Moto).
//	3.	Registrar mantenimiento:
//	•	Buscar por marca y modelo.
//	•	Marcar enReparacion = true.
//	4.	Finalizar mantenimiento:
//	•	Buscar por marca y modelo.
//	•	Marcar enReparacion = false.
//	5.	Ver estado de los vehículos:
//	•	Mostrar si están en reparación o no.


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Vehiculo vehiculo[] = new Vehiculo[100];
        boolean seguir = true;
        var scanner = new Scanner(System.in);


        while (seguir) {

            System.out.println("1) Registrar un vehículo:");
            System.out.println("2) Mostrar vehículos:");
            System.out.println("3) Registrar mantenimiento::");
            System.out.println("4) Finalizar mantenimiento:");
            System.out.println("5) Ver estado de los vehículos:");
            System.out.println("6) salir");
            var opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {

                case 1 -> {
                    RegistrarVehiculo.registroV(vehiculo);
                }
                case 2 -> {

                    for (Vehiculo vehiculo1:vehiculo) {
                       if (vehiculo1!=null){
                           if (vehiculo1 instanceof auto){
                               vehiculo1.informacion();
                           } else if (vehiculo1 instanceof motocicleta) {
                               vehiculo1.informacion();
                           }
                       }
                    }
                }
                case 3 -> {
                    System.out.println("INGRESE la marca DEL VEHICULO");
                    var buscar=scanner.nextLine();
                    for (int i = 0; i < vehiculo.length; i++) {
                        if (vehiculo[i]!=null&& vehiculo[i].getMarca().equals(buscar)) {
                            System.out.println("SE REALIZARA EL MANTENIMIENTO");
                            vehiculo[i].setCondicion(true);
                        }

                    }

                }
                case 4 -> {

                    System.out.println("INGRESE EL MODELO DEL VEHICULO");
                    var buscar=scanner.nextLine();
                    for (int i = 0; i < vehiculo.length; i++) {
                        if (vehiculo[i]!=null&& vehiculo[i].getMarca().equals(buscar)) {
                            System.out.println("VEHICULO CON MANTENIMIENTO FINALIZADO");
                            vehiculo[i].setCondicion(false);
                        }

                    }
                }
                case 5 -> {
                    for (int i = 0; i < vehiculo.length; i++) {
                        if (vehiculo[i]!=null) {
                            System.out.println("MODELO "+vehiculo[i].getModelo()+ "CONDICION: "+vehiculo[i].isCondicion());
                        }
                    }
                }
                case 6 -> {
                    seguir = false;
                }
            }


        }


    }

}
