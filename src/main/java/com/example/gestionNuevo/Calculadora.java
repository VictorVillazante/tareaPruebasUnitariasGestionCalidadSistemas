package com.example.gestionNuevo;

public class Calculadora {
    public String suma(String sumandos) throws Exception{
        if(sumandos!=null && sumandos.equals("")) return "0";
        else{
            int suma=0;
            String[]numeros=sumandos.split(",");
            for(String numero:numeros){
                if(Integer.parseInt(numero)>1000){
                    continue;
                }else if(Integer.parseInt(numero)<0){
                    throw new Exception("Numero negativo");

                }else{
                    suma+=Integer.parseInt(numero);
                }
            }
            return suma+"";
        }
    }
}
