import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void getPrecoT() {
        Pizza pt = new Pizza();
        assertEquals(0,pt.getPreco());
        pt.adicionaIngrediente(1, "cebola");
        assertEquals(15,pt.getPreco());
        pt.zeraIngrediente();
        assertEquals(0,pt.getPreco());
        pt.adicionaIngrediente(1, "cebola");
        assertEquals(15,pt.getPreco());
        pt.adicionaIngrediente(4, "cebola");
        assertEquals(20,pt.getPreco());
        pt.adicionaIngrediente(6, "cebola");
        assertEquals(23,pt.getPreco());


    }
}