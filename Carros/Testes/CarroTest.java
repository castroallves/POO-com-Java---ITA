import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testAcelerar() {

        Carro c  = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(9,c.getVelocidade());
    }

    @Test
    void testParado() {

        Carro c  = new Carro();
        assertEquals(0,c.getVelocidade());
    }

    @Test
    void testFrear() {

        Carro c  = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        assertEquals(5,c.getVelocidade());
    }
}