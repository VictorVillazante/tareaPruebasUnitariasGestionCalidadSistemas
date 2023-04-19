package com.example.gestionNuevo;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
public class AscensorTest {
    @Test
    public void verificarPisoAscensorApertura(){
        Ascensor ascensorEdificio=new Ascensor();
        ascensorEdificio.comenzarDia();
        assertEquals(1, ascensorEdificio.getPosicionAscensor());

    }
    @Test
    public void verificarEstadoAscensorApertura(){
        Ascensor ascensorEdificio=new Ascensor();
        assertEquals("cerrado", ascensorEdificio.verificarAperturaAscensor());

    }
	
}
