package com.example.gestionNuevo;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TestEnRayaTest {
    @Rule
	public ExpectedException exception = ExpectedException.none();


    @Test
    public void cuandoFueraDeXlanzarException() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        exception.expect(Exception.class);
        tresEnRaya.jugar(5, 2);
    }

    @Test
    public void cuandoFueraDeYlanzarException() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        exception.expect(Exception.class);
        tresEnRaya.jugar(2, 5);
    }

    @Test
    public void cuandoLugarOcupadoLanzarException() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        tresEnRaya.jugar(3, 1);
        exception.expect(Exception.class);
        tresEnRaya.jugar(3, 1);
    }

    @Test
    public void cuandoLugarDiferenteNoLanzarException() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        tresEnRaya.jugar(1, 3);
        tresEnRaya.jugar(2, 3);
    }
    @Test
    public void siPrimerTurnoEntoncesJuegaX() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        assertEquals('X', tresEnRaya.siguienteTurno());
    }
    @Test
    public void siPrimerTurnoXSiguienteTurnoCruz() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        tresEnRaya.jugar(2, 3);

        assertEquals('+', tresEnRaya.siguienteTurno());
    }
    @Test
    public void ultimoTurnoCruzSiguienteX() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        tresEnRaya.jugar(2, 3);

        assertEquals('+', tresEnRaya.siguienteTurno());
        tresEnRaya.jugar(2, 1);

        assertEquals('X', tresEnRaya.siguienteTurno());
    }
    @Test
    public void cuandoNoHayGanador() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        String resultado=tresEnRaya.jugar(2, 3);

        assertEquals("No hay ganador aun", resultado);

    }
    @Test
    public void siLlenaColumnaEntoncesGana() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        tresEnRaya.jugar(1, 1);
        tresEnRaya.jugar(1, 2);
        tresEnRaya.jugar(2, 1);
        tresEnRaya.jugar(2, 2);
        String resultado=tresEnRaya.jugar(3,1);
        assertEquals("X es el ganador",resultado);
    }
    @Test
    public void siLlenaFilaEntoncesGana() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        tresEnRaya.jugar(2, 1);
        tresEnRaya.jugar(1, 1);
        tresEnRaya.jugar(3, 1);
        tresEnRaya.jugar(1, 2);
        tresEnRaya.jugar(2, 2);

        String resultado=tresEnRaya.jugar(1,3);
        assertEquals("+ es el ganador",resultado);
    }
    @Test
    public void siLlenaDiagonalEntoncesGana() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        tresEnRaya.jugar(1, 1);
        tresEnRaya.jugar(2, 1);
        tresEnRaya.jugar(2, 2);
        tresEnRaya.jugar(3, 1);

        String resultado=tresEnRaya.jugar(3,3);
        assertEquals("X es el ganador",resultado);
    }
    @Test
    public void siLlenaOtraDiagonal() throws Exception{
        TresEnRaya tresEnRaya=new TresEnRaya();
        
        tresEnRaya.jugar(1, 3);
        tresEnRaya.jugar(2, 1);
        tresEnRaya.jugar(2, 2);
        tresEnRaya.jugar(3, 3);

        String resultado2=tresEnRaya.jugar(3,1);
        assertEquals("X es el ganador",resultado2);
    }
}
