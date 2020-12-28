import java.util.Scanner;

public class Partida{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        Tablero tablero = new Tablero();

        menuInicial();
    }

    public static void menuInicial(){
        Jugador J1 = new Jugador();
        Jugador J2 = new Jugador();

        System.out.println("   ---3 EN RAYA---   ");
        System.out.println("");
        System.out.println("  Para finalizar introduzca \" # \" ");
        System.out.println("");

        //Datos jugador 1
        System.out.println("Introduce el nombre del Jugador 1: ");
        String nombreJ1 = scan.nextLine();
        //System.out.println("Introduce la ficha del Jugador 1: ");
        char fichaJ1 = 'X';

        //Datos jugador 2
        System.out.println("");
        System.out.println("Introduce el nombre del Jugador 2: ");
        String nombreJ2 = scan.nextLine();
        //System.out.println("Introduce la ficha del Jugador 2: ");
        char fichaJ2 = 'O';

        J1.setNombre(nombreJ1);
        J1.setFicha(fichaJ1);
        J2.setNombre(nombreJ2);
        J2.setFicha(fichaJ2);

        if (nombreJ1 == "#" || nombreJ2 == "#" || fichaJ1 == '#' || fichaJ2 == '#'){
            System.out.println("   ---HASTA PRONTO!---   ");
            System.exit(0);
        }

        iniciarPartida(J1, J2);
    }

    public static void iniciarPartida(Jugador J1, Jugador J2){
        Tablero tablero = new Tablero();

        int contadorTurno = 1;
        String fichaGanador = null;

        while (fichaGanador == null){
            if (contadorTurno % 2 != 0){
                System.out.println("");
                System.out.println("Jugador 1, introduzca la fila y la columna separadas por comas: ");
                String[] coordenadas = scan.nextLine().split(",");
                int crdnsFila = Integer.parseInt(coordenadas[0]);
                int crdnsColumna = Integer.parseInt(coordenadas[1]);

                tablero.actualizarTablero(crdnsFila, crdnsColumna, J1);
                fichaGanador = tablero.comprobarGanador();
                contadorTurno++;
            }
            else{
                System.out.println("");
                System.out.println("Jugador 2, introduzca la fila y la columna separadas por comas: ");
                String[] coordenadas = scan.nextLine().split(",");
                int crdnsFila = Integer.parseInt(coordenadas[0]);
                int crdnsColumna = Integer.parseInt(coordenadas[1]);

                tablero.actualizarTablero(crdnsFila, crdnsColumna, J2);
                fichaGanador = tablero.comprobarGanador();
                contadorTurno++;
            }
        }

        if ((fichaGanador).charAt(0) == J1.obtenerFicha()){
            System.out.println("\nEl jugador 1 ha ganado!");
        }
        else if ((fichaGanador).charAt(0) == J2.obtenerFicha()){
            System.out.println("\nEl jugador 2 ha ganado!");
        }
    }
}