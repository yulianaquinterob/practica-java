import java.util.Scanner;
public class katas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el día de la semana (1= lunes, 7= Domingo): ");
        int dia = sc.nextInt();

        System.out.print("Ingresa la hora (0-23): ");
        int hora = sc.nextInt();

        if (dia < 1 || dia > 7){
            System.out.println("Error: El día ingresado no es válido");
        } else if (hora < 0 || hora > 23 ) {
            System.out.println("Error: la hora ingresada no es válida");
        }else {
            switch (dia) {
                case 1, 2, 3, 4, 5 -> {
                    if (hora >= 6 && hora < 20) {
                        System.out.println("La cafetería está abierta.");
                    } else {
                        System.out.println("La cafetería está cerrada.");
                    }
                    System.out.println("Horario de lunes a viernes: 6:00 AM - 8:00 PM");
                }

                case 6 -> {
                    if (hora >= 7 && hora < 14) {
                        System.out.println("La cafetería está abierta.");
                    } else {
                        System.out.println("La cafetería está cerrada.");
                    }
                    System.out.println("Horario de sábado: 7:00 AM - 2:00 PM");
                }

                case 7 -> {
                    System.out.println("La cafetería está cerrada.");
                    System.out.println("Horario de domingo: cerrado todo el día");
                }
            }
        }
        sc.close();
    }
}
