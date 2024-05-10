// Subclase para multiplicar
public class Multiplicacion extends Operacion {
    // Constructor de la subclase que toma dos números como parámetros
    public Multiplicacion(double a, double b) {
        super(a, b); // Llamada al constructor de la clase base (Operaciones) con los valores proporcionados
    }

    // Método que realiza la multiplicación
    public double hacerOperacion() {
        // Retorna el resultado de la multiplicación de los dos números obtenidos de la clase base
        return super.getA() * super.getB();
    }
}
