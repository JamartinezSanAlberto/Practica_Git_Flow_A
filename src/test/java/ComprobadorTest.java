import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobadorTest {

    @Test
    void compruebaTestTrue() {
        Comprobador comp = new Comprobador();
        Boolean resultado = comp.comprueba("HOLA", 4);
        assertTrue(resultado);
    }
    @Test
    void  compruebaTestFalseLongitud(){
        Comprobador comp = new Comprobador();
        Boolean resultado = comp.comprueba("HOLA", 3);
        assertFalse(resultado);
    }
    @Test
    void compruebaTestaFalseCadena(){
        Comprobador comp = new Comprobador();
        Boolean resultado = comp.comprueba("HoLA", 4);
        assertFalse(resultado);
    }



}