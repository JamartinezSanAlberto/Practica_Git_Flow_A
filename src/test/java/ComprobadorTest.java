import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobadorTest {

    @Test
    void getValue() {
        Comprobador prueba = new Comprobador();

        Boolean cadena = prueba.comprueba("Radio", 5);
        assertTrue(cadena);
    }
}