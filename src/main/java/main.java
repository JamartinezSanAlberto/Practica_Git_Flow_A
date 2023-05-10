import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        Creador creador = new Creador();
        String palabra = creador.crear_clave(5);

        Comprobador comprobador = new Comprobador();
        Generador generador = new Generador();
        System.out.println("Escribe una palabra con mayúsculas y 5 letras");
        Scanner sc = new Scanner(System.in);
        String palabra2 = sc.next();

        while (!palabra.equals(palabra2)){
        if (comprobador.comprueba(palabra2, 5)) {
            String resultado = generador.generar_pista(palabra, palabra2);
            System.out.println(resultado);
            System.out.println("Vuelve a intentarlo");
            palabra2 = sc.next();
        }

        }
        System.out.println("Felisitasiones!!!Has acertado la palabra");
    }






}
