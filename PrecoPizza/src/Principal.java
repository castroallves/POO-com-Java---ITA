//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        Pizza p1 = new Pizza();

        p1.adicionaIngrediente(1,"queijo");
        p1.adicionaIngrediente(1, "presunto");
        p1.adicionaIngrediente(1, "bacon");

        Pizza p2 = new Pizza();

        p2.adicionaIngrediente(1, "pimentão");
        p2.adicionaIngrediente(1, "catupiry");
        p2.adicionaIngrediente(1, "frango");

        Pizza p3 = new Pizza();

        p3.adicionaIngrediente(1, "calabresa");
        p3.adicionaIngrediente(1, "tomate");
        p3.adicionaIngrediente(1, "carne seca");

        CarrinhoDeCompra c1 = new CarrinhoDeCompra();

        c1.addPizza(p1);
        c1.addPizza(p2);
        c1.addPizza(p3);

        System.out.println("Preço Total: R$ " + c1.totalCarrinho());

        Pizza.ingredienteTotal();

    }
}