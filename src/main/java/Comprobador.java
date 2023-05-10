public class Comprobador {

    public boolean comprueba(String cadena,  int longitud) {

        if (cadena.matches("[A-Z]+") && cadena.length() == longitud) {
            return true;
        } else
        return false;
        }
}