// clase hija
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    // atributos
    private int numeroAAdivinar;
    // contructor
    public JuegoAdivinaNumero(int numeroDeVidas){
        super(numeroDeVidas);
    }
    // metodos
    public void juega(){
        Scanner sc = new Scanner(System.in);
        Random numrandom = new Random();
        super.reiniciarPartida();

        this.numeroAAdivinar = numrandom.nextInt(11);
        int intentoUsuario;

        do{
            System.out.println("Adivina el numero (entre 0 y 10): ");
            intentoUsuario = sc.nextInt();

            if (intentoUsuario == this.numeroAAdivinar) {
                System.out.println("Acertaste!");
                super.actualizaRecord();
                break;
            }else{
                if (super.quitaVida()) {
                    if (intentoUsuario > this.numeroAAdivinar) {
                        System.out.println("El numero a adivinar es menor");
                    }else{
                        System.out.println("El numero a adivinar es mayor");
                    }
                }else{
                    System.out.println("El numero era: " + this.numeroAAdivinar);
                    break; // sale del bucle porque ya no tiene vidas
                }
            }
        }while(true);
    }

}