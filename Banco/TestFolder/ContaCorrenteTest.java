import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.lang.invoke.ConstantCallSite;

import static org.junit.Assert.*;


class ContaCorrenteTest {

    ContaCorrente cc;
    @BeforeEach
     void inicializaConta(){
         cc = new ContaCorrente();
         cc.depositar(200);
    }

    @org.junit.jupiter.api.Test
    void sacar() {

        int valorSacado = cc.sacar(50);
        assertEquals(cc.saldo, 150);
        assertEquals(valorSacado, 50);
    }

    @org.junit.jupiter.api.Test
    void depositar() {

        assertEquals(cc.saldo, 200);

    }

    @org.junit.jupiter.api.Test
    void sacarMaisQueSaldo() {
        int valorSacado = cc.sacar(250);
        assertEquals(cc.saldo, 200);
        assertEquals(valorSacado, 0);
    }
}