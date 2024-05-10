// Subclase para dividir
public class Division extends Operacion { // Define la subclase Dividir que extiende la clase Operaciones
    public Division(double a, double b) { // Constructor de la clase Dividir que recibe dos parámetros
        super(a, b); // Llama al constructor de la clase base (Operaciones) con los valores proporcionados
    }

    // Método que realiza la división
    public double hacerOperacion() { // Método para realizar la operación de división
        return super.getA() / super.getB(); // Devuelve el resultado de dividir el valor de 'a' entre el valor de 'b'
    }
}
