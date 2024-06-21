import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteCarroSoma {

    CarroSoma c;
    @BeforeEach
    public void inicializaCarro(){
        c = new CarroSoma("teste", 10, 100);
    }

    @Test
    void testAcelerar() {

        c.acelerar();
        assertEquals(10,c.getVelocidade());
    }

    @Test
    void testParado() {

        assertEquals(0,c.getVelocidade());
    }

    @Test
    void testFrear() {

        c.acelerar();
        c.frear();
        assertEquals(5,c.getVelocidade());
    }

    @Test
    void testAcelerarVelMax() {

        for(int i = 0; i<14; i++){
            c.acelerar();
        }
        assertEquals(100,c.getVelocidade());
    }
}