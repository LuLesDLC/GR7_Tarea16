package ec.edu.epn.modelo;

import ec.edu.epn.excepciones.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;

    public Triangulo(double lado1, double lado2, double lado3) throws TrianguloInvalidoException {this.lado1 = lado1;
        // Registra un mensaje de información sobre los lados del triángulo
        Logger logger = Logger.getLogger(Triangulo.class.getName());

        logger.log(Level.INFO, "Lados del triángulo: " + lado1 + ", " + lado2 + ", " + lado3);

        // Verifica si los lados forman un triángulo válido
        if (!esTriangulo(lado1,lado2,lado3)) {
            // Si no es un triángulo válido, lanza la excepción TrianguloInvalidoException
            throw new TrianguloInvalidoException("Los lados proporcionados no forman un triángulo válido.");
        }else {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }

    public boolean esEquilatero(){
        if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
            return true;
        }   else {
            return false;
        }

    }
    public  boolean esIsoceles() {
        if (this.lado1 == this.lado2 || this.lado1 == this.lado3 ||this.lado2 == this.lado3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1);
    }
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2; // Semiperímetro
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }


  public boolean esEscaleno() {
        return this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3;
  }


}
