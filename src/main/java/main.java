import java.util.Scanner;

import static java.lang.System.currentTimeMillis;

public class main {
    public static void main (String[] args) {

        Creador creador = new Creador();
        String palabra = creador.crear_clave(5);

        System.out.println("Bienvenido al juego de adivinar la clave");

        Comprobador comprobador = new Comprobador();
        Generador generador = new Generador();
        System.out.println("Escribe una palabra con mayúsculas y 5 letras");
        Scanner sc = new Scanner(System.in);
        int turnos = 1;
        System.out.println("Turno: " + turnos);
        String palabra2 = sc.next();
        long tiempoInicio = currentTimeMillis();

        while (!palabra.equals(palabra2)){
        if (comprobador.comprueba(palabra2, 5)) {
            String resultado = generador.generar_pista(palabra, palabra2);
            System.out.println(resultado);
            turnos += 1;
            System.out.println("Vuelve a intentarlo");
            System.out.println("Turno: " + turnos);
            palabra2 = sc.next();
        }

        }
        long tiempoFinal= currentTimeMillis();
        long tiempoResultado= (tiempoFinal - tiempoInicio)/1000;
        System.out.println("Enhorabuena!!!Has acertado la palabra");
        System.out.println("Has tardado "+ tiempoResultado + "segundos");

        System.out.println(" ********   RANKING   ********");
        System.out.println("Jezú   - 3 turnos - 27 segundos");
        System.out.println("Manué  - 4 turnos - 36 segundos");
        System.out.println("Alison - 5 turnos - 44 segundos");
        System.out.println("Laura  - 6 turnos - 50 segundos");
        System.out.println("Mariano  - 7 turnos - 56 segundos");
        System.out.println("*******************************");



    }






}
