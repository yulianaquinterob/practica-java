import java.util.Scanner;

public class katas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double subtotal = 0;
        do {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = sc.nextDouble();
            if (precio > 0){
                subtotal+=precio;
            }
        } while(precio != 0);

        double iva = subtotal * 0.19;
        double totalConIva = subtotal + iva;
        double descuento = totalConIva * 0.10;
        double totalFinal = totalConIva - descuento;

        System.out.println("Subtotal: "+subtotal);
        System.out.println("iva(19%): "+iva);
        System.out.println("Total con IVA: "+totalConIva );
        System.out.println("Descuento : 0");
        System.out.println("Total final: "+totalConIva );

        if (totalConIva > 50000){
            System.out.println("Total con iva: "+totalConIva);
            System.out.println("Descuento: "+descuento);
            System.out.println("Total a pagar: "+totalFinal);
        }

        sc.close();
    }
}

