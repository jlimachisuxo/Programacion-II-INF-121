package juego2;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    // Nuevo método para validar si el número está en el rango 0-10
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        super.reiniciarPartida();;

        this.numeroAAdivinar = random.nextInt(11); 
        int intentoUsuario;

        do {
            System.out.print("Adivina el número (entre 0 y 10): ");
            intentoUsuario = sc.nextInt();

            // Validar el número ingresado por el usuario
            if (validaNumero(intentoUsuario)) {
                if (intentoUsuario == this.numeroAAdivinar) {
                    System.out.println("¡Acertaste!");
                    super.actualizaRecord();
                    break;
                } else {
                    if (super.quitaVida()) {
                        if (intentoUsuario > this.numeroAAdivinar) {
                            System.out.println("El número a adivinar es menor.");
                        } else {
                            System.out.println("El número a adivinar es mayor.");
                        }
                    } else {
                        System.out.println("El número era: " + this.numeroAAdivinar);
                        break;
                    }
                }
            } else {
                System.out.println("Error: el número debe estar entre 0 y 10. Pierdes una vida.");
                if (!super.quitaVida()) {
                    System.out.println("El número era: " + this.numeroAAdivinar);
                    break;
                }
            }
        } while (true);
    }
}
