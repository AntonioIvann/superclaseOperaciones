// Subclase para restar
public class Resta extends Operacion {
    // Constructor de la clase Resta que llama al constructor de la clase base
    public Resta(double a, double b) {
        super(a, b); // Llamada al constructor de la clase base con los valores a y b
    }

    // Método que realiza la resta de los valores a y b
    public double hacerOperacion() {
        // Accede a los valores a y b utilizando los métodos de la clase base
        // y realiza la operación de resta
        return super.getA() - super.getB();
    }
}
