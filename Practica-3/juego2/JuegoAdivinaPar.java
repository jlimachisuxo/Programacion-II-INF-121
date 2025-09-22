package juego2;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    // Redefinición del método para validar solo números pares 
    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 != 0) {
            System.out.println("Error: Debes ingresar un número par.");
            return false;
        }
        return super.validaNumero(numero); 
    }
}
