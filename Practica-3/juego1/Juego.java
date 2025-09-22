public class Juego {
    // clase padre 
    // atributos
    protected int numeroDeVidas;
    protected int record;
    // constructor
    public Juego(int numeroDeVidas){
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    // metodos
    public void reiniciarPartida(){
        System.out.println("Reiniciando partida...");
        this.record = 0;
    }

    public void actualizaRecord(){
        this.record++;
        System.out.println("Has acertado! Tu nuevo record es: " + this.record);
        System.out.println("");
    }

    public boolean quitaVida(){
        this.numeroDeVidas--;
        if (this.numeroDeVidas > 0) {
            System.out.println("Incorrecto, te quedan " + this.numeroDeVidas + " vidas.");
            return true;            
        }else{
            System.out.println("Te quedaste sin vidas! El juego ha terminado...");
            System.out.println("");
            return false;
        }
    }
}
