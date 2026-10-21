import java.util.Scanner;
public class katas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalClientes = 0;
        int contadorHoras = 0;
        int maxClientes = -1;
        int horaPico = -1;

        System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
        int hora = scanner.nextInt();

        while (hora != -1) {
            if (hora >= 0 && hora <= 23) {
                System.out.print("Ingresa el número de clientes en esa hora: ");
                int clientes = scanner.nextInt();

                if (clientes >= 0) {
                    totalClientes += clientes;
                    contadorHoras++;

                    if (clientes > maxClientes) {
                        maxClientes = clientes;
                        horaPico = hora;
                    }
                } else {
                    System.out.println("Número de clientes inválido. Debe ser mayor o igual a 0.");
                }
            } else {
                System.out.println("Hora inválida");
            }
            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            hora = scanner.nextInt();
        }
        System.out.println();
        if (contadorHoras == 0) {
            System.out.println("No se ingresaron datos");
        } else {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("--- Reporte de Clientes ---");
            System.out.println("Total de clientes: " + totalClientes);
            System.out.println("Promedio por hora: " + String.format("%.2f", promedio));
            System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " clientes)");
        }
        scanner.close();
    }
}



