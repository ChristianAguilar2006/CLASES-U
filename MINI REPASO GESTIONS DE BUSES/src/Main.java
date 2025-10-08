import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean seguir=true;
        var scanner=new Scanner(System.in);
        Transportadora transportadora=new Transportadora();

        while (seguir){

            System.out.println("1) Registrar un vehículo");
            System.out.println("2) Crear una ruta");
            System.out.println("3) Asignar vehículo a una ruta");
            System.out.println("4) Simular viaje");
            System.out.println("5) Mostrar reporte de vehículos y rutas");
            System.out.println("6) SALIR");
            var opc=scanner.nextInt();


            switch (opc){

                case 1->{

                    System.out.println("INGRESE SU VEHICULO ID");
                    var id=scanner.nextLine();
                    System.out.println("INGRESE LA POSICION X");
                    var pX=scanner.nextLine();
                    System.out.println("INGRESE LA POSICION y");
                    var pY=scanner.nextLine();
                    System.out.println("INGRESE VELOCIDAD MAXIMA");
                    var velodicadM=scanner.nextInt();
                    System.out.println("1) REGISTRAR TAXI");
                    System.out.println("2) REGISTRAR BUS");
                    var opc1=scanner.nextInt();
                    switch (opc1){
                        case 1->{
                            System.out.println("INGRESE LA TARIFA");
                            var tarifa=scanner.nextDouble();
                            Vehiculo taxi=new Taxi(id,pX,pY,velodicadM,tarifa);
                            transportadora.IngresarVehiculos(taxi);

                        }
                        case 2->{
                            System.out.println("INGRESE AFORO DE PASAJEROS");
                            var aforoP=scanner.nextInt();
                            Vehiculo bus=new Bus(id,pX,pY,velodicadM,aforoP);
                            transportadora.IngresarVehiculos(bus);

                        }
                    }

                }
                case 2->{

                    System.out.println("INGRESE EL PUNTO DE PARTIDA");
                    var puntoPartida=scanner.nextLine();

                    System.out.println("INGRESE EL PUNTO DE LLEGADA");
                    var puntoLlegada=scanner.nextLine();

                    Ruta ruta=new Ruta(puntoPartida,puntoLlegada);
                    transportadora.IngresarRutas(ruta);

                }
                case 3->{

                    System.out.println("INGRESE EL NOMNRE DE LA RUTA PUNTO PARTIDAD");
                    var bpx=scanner.nextLine();
                    System.out.println("INGRESE EL NOMNRE DE LA RUTA PUNTO DE LLEGADA");
                    var bpy=scanner.nextLine();

                    for (Ruta rutas: transportadora.getRutas()){
                        if (rutas.getPosicionX().equals(bpx)&&rutas.getPosicionY().equals(bpy)){
                            System.out.println("RUTA ENCONTRADA");
                            System.out.println("INGRESE EL ID DEL VEHICULO");
                            var bid=scanner.nextLine();
                            for (Vehiculo vehiculo:transportadora.getVehiculos()){
                                if (vehiculo.getId().equals(bid)){
                                    System.out.println("ENCONTRADO VEHICULO AGREGADO");
                                    rutas.asignarVehiculo(vehiculo);
                                }
                            }
                        }
                    }
                }
                case 4->{

                }
                case 5->{

                }
                case 6->{

                }
            }
        }


    }
}