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
        //TO-DO
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