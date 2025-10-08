import java.util.Scanner;

public class RegistrarVehiculo {
    static Scanner scanner = new Scanner(System.in);

    public static void registroV(Vehiculo vehiculo[]) {

        System.out.println("REGISTRAR AUTO");
        System.out.println("REGISTRAR MOTOCICLETA");
        var opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc) {


            case 1 -> {
                for (int i = 0; i < vehiculo.length; i++) {
                    if (vehiculo[i] == null) {
                        try {
                            auto a = new auto();
                            System.out.println("INGRESE LA MARCA");
                            var marca = scanner.nextLine();
                            System.out.println("INGRESE EL MODELO");
                            var modelo = scanner.nextLine();
                            System.out.println("INGRESE EL AÑO");
                            var anio = scanner.nextInt();
                            scanner.nextLine();
                            a.AñoValido(anio);
                            System.out.println("INGRESE EL NUMERO DE PUERTAS");
                            var numeroPuertas = scanner.nextInt();
                            scanner.nextLine();
                            a.setMarca(marca);
                            a.setModelo(modelo);
                            a.setAnio(anio);
                            a.setNumPuertas(numeroPuertas);
                            vehiculo[i] = a;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < vehiculo.length; i++) {
                    if (vehiculo[i] == null) {
                        try {
                            motocicleta motocicleta = new motocicleta();
                            System.out.println("INGRESE LA MARCA");
                            var marca = scanner.nextLine();
                            System.out.println("INGRESE EL MODELO");
                            var modelo = scanner.nextLine();
                            System.out.println("INGRESE EL AÑO");
                            var anio = scanner.nextInt();
                            scanner.nextLine();
                            motocicleta.AñoValido(anio);
                            System.out.println("INGRESE ELTIPO DE LLANTAS");
                            var tipo = scanner.nextLine();
                            motocicleta.setMarca(marca);
                            motocicleta.setModelo(modelo);
                            motocicleta.setAnio(anio);
                            motocicleta.setTipoLlantas(tipo);
                            vehiculo[i] = motocicleta;
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                    }
                }
            }

            }

        }


    }

