// Clase base para las operaciones matemáticas
public class Operacion {
    // Atributos para almacenar los valores de la operación
    private double a; // Primer valor de la operación
    private double b; // Segundo valor de la operación

    // Constructor que inicializa los valores
    public Operacion(double a, double b) {
        this.a = a; // Asigna el primer valor proporcionado al atributo 'a'
        this.b = b; // Asigna el segundo valor proporcionado al atributo 'b'
    }

    // Método getter para obtener el valor del primer valor
    public double getA() {
        return a; // Devuelve el valor del atributo 'a'
    }

    // Método setter para establecer el valor del primer valor
    public void setA(double a) {
        this.a = a; // Establece el valor del atributo 'a' con el valor proporcionado
    }

    // Método getter para obtener el valor del segundo valor
    public double getB() {
        return b; // Devuelve el valor del atributo 'b'
    }

    // Método setter para establecer el valor del segundo valor
    public void setB(double b) {
        this.b = b; // Establece el valor del atributo 'b' con el valor proporcionado
    }

    // Método que realiza la operación (este método debe ser sobrescrito por las subclases)
    public double hacerOperacion() {
        return 0; // Devuelve un valor por defecto (0) que debe ser sobrescrito por las subclases
    }
}
