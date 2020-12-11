public class Jugador {
    public String nombre;
    private char ficha;
    public int totalFichas;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFicha(char ficha){
        this.ficha = ficha;        
    }

    public void actualizarTotalFichas(){
        totalFichas--;
    }

    public char obtenerFicha(){
        return ficha;
    }
}