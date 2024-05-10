import java.util.Scanner;

public class MainOperacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("¿Qué operacion deseas realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();

            if (opcion == 5) {
                System.out.println("Has salido del programa");
                break; // Termina el bucle y sale del programa si el usuario elige la opción 5 (Salir)
            }

            System.out.println("Ingresa el primer numero:");
            double a = sc.nextDouble();
            System.out.println("Ingresa el segundo numero:");
            double b = sc.nextDouble();

            switch (opcion) {
                case 1:
                    Suma suma = new Suma(a, b);
                    System.out.println("La suma es: " + suma.hacerOperacion());
                    break;
                case 2:
                    Resta resta = new Resta(a, b);
                    System.out.println("La resta es: " + resta.hacerOperacion());
                    break;
                case 3:
                    Multiplicacion multiplicar = new Multiplicacion(a, b);
                    System.out.println("La multiplicacion es: " + multiplicar.hacerOperacion());
                    break;
                case 4:
                    Division dividir = new Division(a, b);
                    System.out.println("La division es: " + dividir.hacerOperacion());
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
            }
        }
        sc.close();
    }
}
