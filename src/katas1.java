import java.util.Scanner;

public class katas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el total de la cuenta: ");
        double totalCuenta = sc.nextDouble();
        System.out.print("Ingresa el total de la propina: ");
        double propina = sc.nextDouble();

        if (totalCuenta < 0) {
            System.out.println("Error: total inválido");
        } else  if (propina < 0 || propina > 100) {
            System.out.println("Error: porcentaje inválido");
        } else {
            double valorPropina = (totalCuenta * propina) / 100;
            double totalPagar = totalCuenta + valorPropina;
            System.out.println("Propina: " + valorPropina);
            System.out.println("total a pagar: " + totalPagar);
        }

        if (propina > 30){
            System.out.println("¡propina generosa!");
        } else if (propina >5 ) {
            System.out.println("¡propina muy baja!");
        }

        sc.close();
    }
}


