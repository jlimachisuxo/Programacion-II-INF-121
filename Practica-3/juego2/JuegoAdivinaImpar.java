package juego2;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    // Redefinición del método para validar solo números impares 
    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Error: Debes ingresar un número impar.");
            return false;
        }
        return super.validaNumero(numero); 
    }
}

