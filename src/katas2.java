import java.util.Scanner;
public class katas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la bebida: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa la temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 60){
            System.out.println(nombre + ":caliente");
        } else if (temperatura >= 30 && temperatura <= 60) {
            System.out.println(nombre + ":Templada");
            
        } else {
            System.out.println(nombre +":Fría");
        }
        sc.close();


    }
}
