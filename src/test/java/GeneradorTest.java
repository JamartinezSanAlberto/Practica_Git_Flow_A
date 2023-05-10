import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorTest {

    @org.junit.jupiter.api.Test
    void testGenerar() {

        Generador gen = new Generador();

        String pista = gen.generar_pista("MUNDO", "DONUT");
        assertEquals(pista, "XXOX-");

        String pista2 = gen.generar_pista("LUCAS", "OSCAR");
        assertEquals(pista2, "-XOO-");

        String pista3 = gen.generar_pista("TODO", "TODO");
        assertEquals(pista3, "OOOO");




    }
}

