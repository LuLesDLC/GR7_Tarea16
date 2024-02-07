

package ec.edu.epn.modelo;

import ec.edu.epn.excepciones.*;;

public class Triangulo {

private double lado1;
private double lado2;
private double lado3;

public Triangulo(double lado1, double lado2, double lado3) throws TrianguloInvalidoException {
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
//La suma de 2 lados de un tirangulo debe ser mayor que el lado restante
if (lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado3 + lado1 < lado2) {
        throw new TrianguloInvalidoException("Los lados dados no forman un triangulo");
}

}

public boolean esEquilatero(){
        if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
        return true;
    }   else {
    return false;
    }

}

}
