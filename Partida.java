import java.util.Scanner;

public class Partida{
    public static void main(String args[]) {
        Tablero tablero = new Tablero();

        menuInicial();
        iniciarPartida(tablero);
    }

    public static void menuInicial(){
        Scanner scan = new Scanner(System.in);
        Jugador J1 = new Jugador();
        Jugador J2 = new Jugador();

        System.out.println("   ---3 EN RAYA---   ");
        System.out.println("");
        System.out.println("  Para finalizar introduzca \" # \" ");
        System.out.println("");

        //Datos jugador 1
        System.out.println("Introduce el nombre del Jugador 1: ");
        String nombreJ1 = scan.nextLine();
        System.out.println("Introduce la ficha del Jugador 1: ");
        char fichaJ1 = scan.next().charAt(0);

        //Datos jugador 2
        System.out.println("");
        System.out.println("Introduce el nombre del Jugador 2: ");
        String nombreJ2 = scan.nextLine();
        System.out.println("Introduce la ficha del Jugador 2: ");
        char fichaJ2 = scan.next().charAt(0);

        J1.setNombre(nombreJ1);
        J1.setFicha(fichaJ1);
        J2.setNombre(nombreJ2);
        J2.setFicha(fichaJ2);

        if (nombreJ1 == "#" || nombreJ2 == "#" || fichaJ1 == '#' || fichaJ2 == '#'){
            System.out.println("   ---HASTA PRONTO!---   ");
            System.exit(0);
        }

        scan.close();
    }

    public static void iniciarPartida(Tablero tablero){
        int contadorTurno = 1;
    }
}