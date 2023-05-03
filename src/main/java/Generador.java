public class Generador {

    public String generar_pista(String palabra1, String palabra2) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabra2.length(); i++) {
            char letra = palabra2.charAt(i);

            if (palabra1.indexOf(letra) != -1) {
                if (palabra1.charAt(i) == letra) {
                    resultado.append("O");
                } else {
                    resultado.append("X");
                }
            } else {
                resultado.append("-");
            }
        }

        return resultado.toString();
    }
}


