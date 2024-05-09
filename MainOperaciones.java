// Importa la clase Scanner del paquete java.util para leer la entrada del usuario
import java.util.Scanner;

// Clase principal para realizar operaciones aritméticas
public class MainOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese dos números
        System.out.println("Ingresa el primer número:");
        double a = sc.nextDouble(); // Lee el primer número ingresado por el usuario
        System.out.println("Ingresa el segundo número:");
        double b = sc.nextDouble(); // Lee el segundo número ingresado por el usuario

        // Crea instancias de las subclases y realiza las operaciones con los números proporcionados
        Suma suma = new Suma(a, b); // Crea una instancia de la clase Suma con los números proporcionados
        Resta resta = new Resta(a, b); // Crea una instancia de la clase Resta con los números proporcionados
        Multiplicacion multiplicar = new Multiplicacion(a, b); // Crea una instancia de la clase Multiplicar con los números proporcionados
        Division dividir = new Division(a, b); // Crea una instancia de la clase Dividir con los números proporcionados

        // Imprime los resultados de las operaciones
        System.out.println("La suma es: " + suma.hacerOperacion()); // Imprime el resultado de la suma
        System.out.println("La resta es: " + resta.hacerOperacion()); // Imprime el resultado de la resta
        System.out.println("La multiplicación es: " + multiplicar.hacerOperacion()); // Imprime el resultado de la multiplicación
        System.out.println("La división es: " + dividir.hacerOperacion()); // Imprime el resultado de la división

        sc.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
