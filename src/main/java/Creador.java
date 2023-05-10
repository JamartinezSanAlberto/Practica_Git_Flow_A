public class Creador {
    private String palabra;

    public  String crear_clave(int numLetras) {
        palabra = "";
        for (int i = 0; i < numLetras; i++) {
            int codigoAscii = (int)Math.floor(Math.random()*(122-97)+97);
            palabra = palabra+(char)codigoAscii;
        }
        return palabra.toUpperCase();
    }
}

