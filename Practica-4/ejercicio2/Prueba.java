package ejercicio2;

import java.util.Random;
public class Prueba {
    public static void main(String[] args) {
        // arreglo para cinco figuras 
        Figura[] figuras = new Figura[5];
        
        // Generador de números aleatorios
        Random rand = new Random();
        
        String[] colores={"verde", "azul", "lila", "negro", "rojo"};

        System.out.println("Creando Figuras Aleatorias");
        
        for (int i = 0; i < figuras.length; i++) {
            // Genera 1 para Cuadrado, 2 para Círculo
            int tipoFig = rand.nextInt(2) + 1; 
            
            // genera una dimensión aleatoria 
            double dimension = 1.0 + (10.0 - 1.0) * rand.nextDouble();
            
            // Selecciona un color aleatorio
            String color = colores[rand.nextInt(colores.length)];

            if (tipoFig == 1) {
                // Crea un Cuadrado
                figuras[i] = new Cuadrado(dimension, color);
                System.out.printf("%d. Creado Cuadrado con lado %.2f y color %s.%n", i + 1, dimension, color);
            } else {
                // Crea un Círculo
                figuras[i] = new Circulo(dimension, color);
                System.out.printf("%d. Creado Círculo con radio %.2f y color %s.%n", i + 1, dimension, color);
            }
        }

        System.out.println("\nProcesando Figuras");

        for (int i = 0; i < figuras.length; i++) {
            Figura figura = figuras[i];
            
            System.out.println("\nFigura #" + (i + 1));
            System.out.println(figura);             
            // Muestra el área 
            System.out.printf("Área: %.2f%n", figura.area());            
            // Muestra el perímetro 
            System.out.printf("Perímetro: %.2f%n", figura.perimetro());
                        // Invoca al método comoColorear() 
            if (figura instanceof Coloreado) {
                Coloreado figuraColoreable = (Coloreado) figura;
                System.out.println("Método Colorear: " + figuraColoreable.comoColorear());
            } else {
                System.out.println("Método Colorear: Esta figura no tiene un método 'comoColorear' específico.");
            }
        }
    }
}

