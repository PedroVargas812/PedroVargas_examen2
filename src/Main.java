import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pv_cuentaAhorros cuenta = new Pv_cuentaAhorros(20.0f, 0.05f);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE CUENTA =====");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver estado de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    float deposito = scanner.nextFloat();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    float retiro = scanner.nextFloat();
                    cuenta.retirarr(retiro);
                    break;
                case 3:
                    cuenta.imprimir();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

