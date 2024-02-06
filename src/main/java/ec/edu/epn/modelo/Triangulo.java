

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
}

public boolean esEquilatero(){
        if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
        return true;
    }   else {
    return false;
    }

}
public boolean esEscaleno() {
        return this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3;
}

}
