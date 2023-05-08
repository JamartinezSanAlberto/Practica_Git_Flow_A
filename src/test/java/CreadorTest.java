import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreadorTest {

    @Test
    void comprobarClaseCreador() {
        Creador c = new Creador();
        int numLetras = 5;
        String palabra = c.crear_clave(numLetras);
        assertEquals(numLetras, palabra.length());

    }
}