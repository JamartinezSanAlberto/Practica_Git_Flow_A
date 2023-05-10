import java.util.Scanner;

import static java.lang.System.currentTimeMillis;

public class main {
    public static void main (String[] args) {

        Creador creador = new Creador();
        String palabra1 = creador.crear_clave(5);
        System.out.println(palabra1);

        System.out.println("Bienvenido al juego de adivinar la clave");

        Comprobador comprobador = new Comprobador();
        Generador generador = new Generador();
        System.out.println("Escribe una palabra con mayúsculas y 5 letras");
        Scanner sc = new Scanner(System.in);
        String palabra2 = sc.next();
        long tiempo = currentTimeMillis();

        while (!palabra1.equals(palabra2)){

        if (comprobador.comprueba(palabra2, 5)) {
            String resultado = generador.generar_pista(palabra1, palabra2);
            System.out.println(resultado);
            System.out.println("Vuelve a intentarlo");
            palabra2 = sc.next();
        }


        }
        long tiempoFinal= currentTimeMillis();
        long tiempoResultado= (tiempoFinal - tiempo)/1000;
        System.out.println("Enhorabuena!!!Has acertado la palabra");
        System.out.println("Has tardado "+ tiempoResultado + "segundos");
    }






}
