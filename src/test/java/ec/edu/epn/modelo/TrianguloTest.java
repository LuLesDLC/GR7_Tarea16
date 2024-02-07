
package ec.edu.epn.modelo;

import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.epn.excepciones.*;

import org.junit.jupiter.api.BeforeAll;

public class TrianguloTest {


    @Test
    public void crearTrianguloException() {
        double lado1 = 25, lado2 = 25, lado3 = 60;
        String resultadoEsperado = "Los lados dados no forman un triangulo";
        TrianguloInvalidoException resultadoObtenido = assertThrows(TrianguloInvalidoException.class,
                () -> new Triangulo(lado1, lado2, lado3));
        assertEquals(resultadoEsperado, resultadoObtenido.getMessage());
    }

    @Test
    public void calcularArea() {
    }

    @Test
    public void clasificarTipo() {
    }


    @Test
    public void testCrearTrianguloEscaleno(){
    }

    @Test
    public void testCrearTrianguloIsósceles() {

    }

    @Test
    public void testEsEquilateroTrue() throws TrianguloInvalidoException{
        double lado1 = 20, lado2 = 20, lado3 = 20;
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        boolean resultadoObtenido = triangulo.esEquilatero();
        assertTrue(resultadoObtenido);
    }

    @Test
    public void testEsEquilateroFalse() throws TrianguloInvalidoException {
        double lado1 = 20, lado2 = 10, lado3 = 10;
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        boolean resultadoObtenido = triangulo.esEquilatero();
        assertFalse(resultadoObtenido);
    }


}