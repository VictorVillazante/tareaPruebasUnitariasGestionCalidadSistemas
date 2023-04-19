package com.example.gestionNuevo;

public class TresEnRaya {
    private char ultimoJugador='+';
    private Character[][] tablero = {{'0', '0', '0'},
            						 {'0', '0', '0'},
            						 {'0', '0', '0'}};
    private final int tamanho=3;

    public String jugar(int x, int y) throws Exception{
        
        verificarEje(x);
        verificarEje(y);
        ultimoJugador=siguienteTurno();
        asignarPosicion(x,y);
        if(hayGanador()){
            return ultimoJugador + " es el ganador";
        }
        return "No hay ganador aun";

    }
    public void verificarEje(int eje) throws Exception{
        if(eje>3 || eje<1) throw new Exception("Fuera del tablero");

    }
    public void asignarPosicion(int x,int y) throws Exception{
        if(tablero[x-1][y-1]!='0'){
            throw new Exception("Casilla ocupada");
        }else{
            tablero[x-1][y-1]=ultimoJugador;
            System.out.println("Asignando posicion x="+x+"y="+y+"ficha="+ultimoJugador);
        }
    }
    public char siguienteTurno() {
        if(ultimoJugador=='X'){
            return '+';
        }
        return 'X';
    }
    public boolean hayGanador(){
        for(int i=0;i<3;i++){
            System.out.println(tablero[0][i]+""+ tablero[1][i]+""+tablero[2][i]);
            if(tablero[0][i]+ tablero[1][i]+tablero[2][i]==ultimoJugador*tamanho){
                return true;
            }
            if(tablero[i][0]+ tablero[i][1]+tablero[i][2]==ultimoJugador*tamanho){
                return true;
            }
            if(tablero[i%3][i%3]+ tablero[(i+1)%3][(i+1)%3]+tablero[(i+2)%3][(i+2)%3]==ultimoJugador*tamanho){
                return true;
            }
            if(tablero[0][2]+ tablero[i][i]+tablero[2][0]==ultimoJugador*tamanho){
                return true;
            }
        }
        return false;
    }
}
//encontrar el test erroneo
//refactorizar