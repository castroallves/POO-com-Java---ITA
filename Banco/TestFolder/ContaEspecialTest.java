import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ContaEspecialTest extends ContaCorrenteTest {

    ContaEspecial cc;
    @BeforeEach
    void inicializaConta(){
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @org.junit.jupiter.api.Test
    void sacarMaisQueSaldo() {
        int valorSacado = cc.sacar(350);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0);
    }


}