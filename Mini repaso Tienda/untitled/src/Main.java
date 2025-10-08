import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();
        boolean seguir = true;
        var scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        while (seguir) {

            System.out.println("1) REGISTRAR PRDUCTO");
            System.out.println("2) REGISTRAR CLIENTE");
            System.out.println("3) VER PRODUCTOS");
            System.out.println("4) VER CLIENTES");
            System.out.println("5) VENDER");
            System.out.println("6) VER PRODUCTOS COMPRADOS");
            System.out.println("7) salir");
            var opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1 -> {


                    System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
                    var nombreP = scanner.nextLine();
                    System.out.println("INGRESE EL PRECIO");
                    var precioP = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("INGRESE LA CANTIDAD");
                    var cantidadP = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("INGRESE");
                    System.out.println("1) COMESTIBLE");
                    System.out.println("2) PRODUCTO DE ASEO");
                    var opc2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (opc2) {
                        case 1 -> {
                            System.out.println("INGRESE EL NIVEL DE COLESTEROL");
                            var nivelC = scanner.nextDouble();
                            var Comestible = new Comestibles(nombreP, precioP, cantidadP, nivelC);
                            tienda.registrarUnProductos(Comestible);
                        }
                        case 2 -> {
                            System.out.println("INGRESE EL CODIGO DE REGISTRO SANITARIO");
                            var codigoG = scanner.nextLine();
                            var Aseo = new AseoProductos(nombreP, precioP, cantidadP, codigoG);
                            tienda.registrarUnProductos(Aseo);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("INGRESE EL NOMBRE");
                    var nombre = scanner.nextLine();
                    var cliente = new Cliente(nombre);
                    tienda.registrarUnCliente(cliente);
                }
                case 3 -> {
                    for (Producto tienda1 : tienda.getTodosLosProductos()) {
                        tienda1.infoProducto();
                    }
                }
                case 4 -> {
                    for (Cliente cliente : tienda.getTodosLosClientes()) {
                        cliente.infoCliente();
                    }
                }
                case 5 -> {

                    System.out.println("INGRESE EL NOMBRE DEL CLIENTE");
                    var busquedaCliente = scanner.nextLine();
                    for (Cliente cliente : tienda.getTodosLosClientes()) {
                        if (cliente.getNombreCliente().equals(busquedaCliente)) {
                            System.out.println("CLIENTE ENCONTRADO");
                            System.out.println("INGRESE EL NOMBRE DEL PRODCUTO");
                            var busquedaProducto = scanner.nextLine();
                            for (Producto producto : tienda.getTodosLosProductos()) {
                                if (producto.getNombre().equals(busquedaProducto)) {
                                    System.out.println("PRODUCTO ENCONTRADO");
                                    System.out.println("INGRESE LA CANTIDAD");
                                    var cantidad = scanner.nextInt();
                                    try {
                                        if (producto instanceof Comestibles) {

                                            cliente.venderProducto(producto, cantidad);
                                        } else if (producto instanceof AseoProductos) {
                                            cliente.venderProducto(producto, cantidad);
                                        }
                                    } catch (StockInvalidoException e) {
                                        System.out.println(e.getMessage());
                                    }


                                }
                            }
                        }
                    }
                }
                case 6 -> {

                    for (Cliente cliente: tienda.getTodosLosClientes()){
                        cliente.mostrarVentas();
                    }
                }
                case 7 -> seguir = false;


            }


        }

    }
}