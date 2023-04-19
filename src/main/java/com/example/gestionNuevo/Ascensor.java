package com.example.gestionNuevo;
public class Ascensor {
    private boolean[] pisoOcupadoEdificio=new boolean[]{true,false,false};
    private int posicionAscensor;

    public int getPosicionAscensor() {
        return posicionAscensor;
    }

    public void setPosicionAscensor(int posicionAscensor) {
        this.posicionAscensor = posicionAscensor;
    }

    public void comenzarDia() {
        cambiarPosicionAscensor(1);
    }

    private void cambiarPosicionAscensor(int posicion) {
        for(int i=0;i<3;i++){
            if(i==posicion-1){
                pisoOcupadoEdificio[i]=true;
                setPosicionAscensor(posicion);
            }
            else pisoOcupadoEdificio[i]=false;
        }
        
    }



}
