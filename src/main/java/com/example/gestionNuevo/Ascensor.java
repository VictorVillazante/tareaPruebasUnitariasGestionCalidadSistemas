package com.example.gestionNuevo;
public class Ascensor {
    private boolean[] pisoLlamadaEdificio=new boolean[]{true,false,false};
    private int posicionAscensor;
    private int pisoDestino;
    private boolean estadoAscensor;
    private final int NUMERO_PISOS=3;
    private final int PISO_INICIAL=1;
    private int numeroPersonasDemandantesDeAscensor=0;

    public boolean getEstadoAscensor() {
        return estadoAscensor;
    }

    public void setEstadoAscensor(boolean estadoAscensor) {
        this.estadoAscensor = estadoAscensor;
    }

    public int getPosicionAscensor() {
        return posicionAscensor;
    }

    public void setPosicionAscensor(int posicionAscensor) {
        this.posicionAscensor = posicionAscensor;
    }

    public void comenzarDia() {
        setEstadoAscensor(false);
        cambiarPosicionAscensor(PISO_INICIAL);
    }

    private void cambiarPosicionAscensor(int posicion) {
        for(int i=0;i<3;i++){
            if(i==posicion-1){
                pisoLlamadaEdificio[i]=true;
                setPosicionAscensor(posicion);
            }
            else pisoLlamadaEdificio[i]=false;
        }
        
    }

    public String verificarAperturaAscensor() {
        if(getEstadoAscensor()) return "abierto";
        return "cerrado";
    }

    public void crearPersonaDemandeAscensorPiso() {
        int posicionInicialPersona=(int) (Math.random()*NUMERO_PISOS)+PISO_INICIAL;
        int posicionDestinoPersona=posicionInicialPersona;
        while(posicionInicialPersona==posicionDestinoPersona){
            posicionDestinoPersona=(int) (Math.random()*NUMERO_PISOS)+PISO_INICIAL;
        }
        System.out.println("posicion inicial persona "+posicionInicialPersona);
        System.out.println("posicion destino persona "+posicionDestinoPersona);
        numeroPersonasDemandantesDeAscensor++;
        System.out.println("Piso ascensor inicial "+posicionAscensor);
        pisoDestino=posicionInicialPersona;
        posicionAscensor=pisoDestino;
        System.out.println("Piso ascensor para recoger persona "+posicionAscensor);
        pisoDestino=posicionDestinoPersona;
        posicionAscensor=pisoDestino;
        System.out.println("Piso ascensor para dejar persona "+posicionAscensor);
        numeroPersonasDemandantesDeAscensor--;
        
    }
    public int getNumeroPersonasDemandantesDeAscensor() {
        return numeroPersonasDemandantesDeAscensor;
    }



}
