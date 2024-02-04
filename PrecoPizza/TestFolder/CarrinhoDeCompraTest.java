import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoDeCompraTest {

    @Test
    void totalCarrinho() {
        CarrinhoDeCompra ct1 = new CarrinhoDeCompra();
        Pizza pt1 = new Pizza();
        assertEquals(404, ct1.addPizza(pt1));
        Pizza pt2 = new Pizza();
        Pizza pt3 = new Pizza();

        pt1.adicionaIngrediente(1, "cebola");
        pt2.adicionaIngrediente(2, "cebola");
        pt3.adicionaIngrediente(6, "cebola");

        ct1.addPizza(pt1);
        ct1.addPizza(pt2);
        ct1.addPizza(pt3);

        assertEquals(53, ct1.totalCarrinho());


    }
}