public class Tablero{
    String[][] tablero = { 
        {"0", "0", "0"}, 
        {"0", "0", "0"},
        {"0", "0", "0"}
    };

    public void actualizarTablero(int fila, int columna, Jugador jugador){
        if (esPosicionFichaValida(fila, columna)){
            String ficha = String.valueOf(jugador.obtenerFicha());
            tablero[fila][columna] = ficha;
            jugador.actualizarTotalFichas();
        }
        pintarTablero();
    }

    public String comprobarGanador(){
        String ganador = null; 
        
         //Comprobacion posiciones horizontal
        if (tablero[0][0] != "0" && tablero[0][0].equals(tablero[0][1]) && tablero[0][0].equals(tablero[0][2])){
            return tablero[0][0];
        }

        else if (tablero[1][0] != "0" && tablero[1][0].equals(tablero[1][1]) && tablero[1][0].equals(tablero[1][2])){
            return tablero[1][0];
        
        }

        else if (tablero[2][0] != "0" && tablero[2][0].equals(tablero[2][1]) && tablero[2][0].equals(tablero[2][2])){
            return tablero[0][0];
        }

        //Comprobacion posiciones vertical
        for (int i = 0; i <= 2; i++){ 
            if (tablero[0][i] != "0"){
                if (tablero[1][i].equals(tablero[0][i]) && tablero[2][i].equals(tablero[0][i])){
                    return tablero[0][i];
                }
            }
        }

        //Comprobacion posiciones diagonal
        if (tablero[0][0] != "0" && tablero[1][1].equals(tablero[0][0]) && tablero[2][2].equals(tablero[0][0])){
            return tablero[0][0];
        }

        if (tablero[0][2] != "0" && tablero[1][1] == tablero[0][2] && tablero[2][0] == tablero[0][2]){
            return tablero[0][2];
        }

        //Nadie ha ganado
        for (int i = 0; i <= tablero.length; i++){
            for (int j = 0; j <= tablero[i].length; j++){
                if (tablero[i][j] != "0"){
                    return null;
                }
            }
        }

        return ganador;
    }

    public boolean esPosicionFichaValida(int fila, int columna){
        if ((fila <= 2 && columna <= 2) && (fila >= 0 && columna >= 0)){
            if (tablero[fila][columna] == "0"){
                return true;
            }
        }
        return false;
    }

    public void pintarTablero(){
        System.out.println("----- TABLERO -----");
		System.out.println("_____________");
		System.out.println("| "+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]+" |");
		System.out.println("_____________");
		System.out.println("| "+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]+" |");
		System.out.println("_____________");
		System.out.println("| "+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]+" |");
		System.out.println("_____________");
    }
}