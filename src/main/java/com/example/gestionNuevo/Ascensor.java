package com.example.gestionNuevo;
public class Ascensor {
    private boolean[] ascensor=new boolean[]{true,false,false};
    private int posicionAscensor;

    public int getPosicionAscensor() {
        return posicionAscensor;
    }

    public void setPosicionAscensor(int posicionAscensor) {
        this.posicionAscensor = posicionAscensor;
    }

    public void comenzarDia() {
        // cambiarPosicionAscensor(1);
       posicionAscensor=0;

    }

    // private void cambiarPosicionAscensor(int posicion) {
    //     for(int i=0;i<3;i++){
    //         if(i==posicion-1) posicionAscensor[i]=true;
    //         else posicionAscensor[i]=false;
    //     }
        
    // }



}
