package com.example.gestionNuevo;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class CalculadoraTest {
    @Rule
	public ExpectedException exception = ExpectedException.none();

    @Test
    public void siCadenaVaciaRetornaCero() throws Exception{
        //1 Preparacion de la prueba
        Calculadora c=new Calculadora();
        //2 Logica de la prueba
        String resultado=c.suma("");
        //3 Verificacion o Assert
        assertEquals("0", resultado);
    }
    @Test
    public void paraDosNumerosRetornaSuma() throws Exception{
        //1 Preparacion de la prueba
        Calculadora c=new Calculadora();
        //2 Logica de la prueba
        String resultado=c.suma("5,6");
        //3 Verificacion o Assert
        assertEquals("11", resultado);
    }


    @Test
    public void paraTresNumerosRetornaSuma() throws Exception{
        //1 Preparacion de la prueba
        Calculadora c=new Calculadora();
        //2 Logica de la prueba
        String resultado=c.suma("5,6,10");
        //3 Verificacion o Assert
        assertEquals("21", resultado);
    }

    @Test
    public void noSumaMil() throws Exception{
        //1 Preparacion de la prueba
        Calculadora c=new Calculadora();
        //2 Logica de la prueba
        String resultado=c.suma("5,6,1000");
        //3 Verificacion o Assert
        assertEquals("1011", resultado);
        assertEquals("11", c.suma("5,6,1001"));

    }
    @Test
    public void lanzaExcepcionConNegativo() throws Exception{
        //1 Preparacion de la prueba
        Calculadora c=new Calculadora();
        //2 Logica de la prueba
        String resultado=c.suma("5,6,1000");
        //3 Verificacion o Assert
        assertEquals("1011", resultado);
        exception.expect(Exception.class);
        assertEquals("6", c.suma("-5,6,1001"));

    }
}
