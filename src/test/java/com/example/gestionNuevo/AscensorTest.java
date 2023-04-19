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
        ascensorEdificio.comenzarDia();
        assertEquals("cerrado", ascensorEdificio.verificarAperturaAscensor());
    }
	@Test
    public void verificarAtencioneticionPersonaAscensor(){
        Ascensor ascensorEdificio=new Ascensor();
        ascensorEdificio.comenzarDia();
        ascensorEdificio.crearPersonaDemandeAscensorPiso();
        assertEquals(0, ascensorEdificio.getNumeroPersonasDemandantesDeAscensor());
    }
    // @Test
    // public void verificarAtencionDiezPersonasPeticionAscensor(){
    //     Ascensor ascensorEdificio=new Ascensor();
    //     ascensorEdificio.comenzarDia();
    //     ascensorEdificio.crearPersonaDemandeAscensorPiso();
    //     assertEquals(0, ascensorEdificio.getNumeroPersonasDemandantesDeAscensor());
    // }
}
