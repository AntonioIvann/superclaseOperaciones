// Subclase para sumar
public class Suma extends Operacion {
    // Constructor de la clase Suma que recibe dos parámetros
    public Suma(double a, double b) {
        super(a, b); // Llamada al constructor de la clase base (Operaciones) con los valores proporcionados
    }

    // Método que realiza la suma
    public double hacerOperacion() {
        // Retorna la suma de los dos números a y b, los cuales se obtienen mediante los métodos
        // getA() y getB() heredados de la clase base (Operaciones)
        return super.getA() + super.getB();
    }
}
