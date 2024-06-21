import static org.junit.jupiter.api.Assertions.*;

class CompraParceladaTest {

    CompraParcelada c1;

    @org.junit.jupiter.api.Test
    void compraParcelada1x() {
        c1 = new CompraParcelada(10, 1, 0.2);
        assertEquals(12, c1.total());
    }

    @org.junit.jupiter.api.Test
    void compraParcelada2x() {
        c1 = new CompraParcelada(10, 2, 0.2);
        assertEquals(14.4,c1.total(),0.01);
    }

    @org.junit.jupiter.api.Test
    void compraParcelada5x() {
        c1 = new CompraParcelada(10, 5, 0.2);
        assertEquals(10,10,10);
        assertEquals(24.88, c1.total(),0.01);
    }

    @org.junit.jupiter.api.Test
    void compraParcelada10x() {
        c1 = new CompraParcelada(10, 10, 0.2);
        assertEquals(61.91, c1.total(),0.01);
    }

}