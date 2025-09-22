package juego2;

public class Aplicacion {

    public static void main(String[] args) {
        System.out.println("--- JUEGO DE ADIVINAR NÚMEROS ---");
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        juegoNormal.juega();

        System.out.println("\n--- JUEGO DE ADIVINAR NÚMEROS PARES ---");
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        juegoPar.juega();

        System.out.println("\n--- JUEGO DE ADIVINAR NÚMEROS IMPARES ---");
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        juegoImpar.juega();
    }
}

