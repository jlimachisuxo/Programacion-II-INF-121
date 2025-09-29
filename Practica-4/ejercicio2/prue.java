package ejercicio2;

import java.util.Random;

public class prue {
    // arreglo para cinco figuras
        Figura[] figuras = new Figura[5];
        // generando numeros aleatorios
        Random nrandom = new Random();

        String[] colores={"verde", "azul", "lila", "negro", "rojo"};
        System.out.println("Creando figuras aleatorias");
        for(int i=0; i<figuras.length; i++){
            // genera 1 para cuadrado y 2 para circulo
            int tipoFig = nrandom.nextInt(2) + 1;
            // genera una dimension aleatoria (lado o radio) entre 1.0 y 10.0
            double dimension = 1.0 + (10.0 - 1.0) * nrandom.nextDouble();
            // selecciona un color aleatorio
            String color = colores[nrandom.nextInt(colores.length)];

            if (tipoFig == 1) {
                // crea un cuadrado
                figuras[i] = new Cuadrado(dimension, color);
                System.out.printf("%d. Creado Cuadrado con lado %.2f y color %s.%n", i + 1, dimension, color);
            } else{
                // crea un circulo
                figuras[i] = new Circulo(dimension, color);
                System.out.printf("%d. Creado Círculo con radio %.2f y color %s.%n", i + 1, dimension, color);
            }
        }

        System.out.println("Procesando figuras");
        for(int i=0; i<figuras.length; i++){
            Figura figura = figuras[i];
            System.out.println("\nFigura #" + (i+1));
            System.out.println(figura);
            System.out.printf("Area: %.2f%n", figura.area());
            System.out.printf("Perimetro: %.2f%n", figura.perimetro());
            // invocando al metodo comoColorear()
            if (figura instanceof Coloreado) {
                Coloreado figColoreable = (Coloreado)figura;
                System.out.println("Metodo Colorear: " + figColoreable.comoColorear());
            } else{
                System.out.println("Metodo Colorear: Esta figutra no tiene un metodo 'comoColorear' especifico");
            }
        }
}
