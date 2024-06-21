//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        // INICIALIZA DOIS PRODUTOS IGUAIS ENTRE SI E UM DIFERENTE
        Produto p0 = new Produto("Tenis Branco",0,100.00);
        Produto p1 = new Produto("Tenis Azul",0,100.00);
        Produto p2 = new Produto("Tenis Verde",1,200.00);

        // INICIALIZA DOIS PRODUTOS COM TAMANHO, IGUAIS ENTRE SI E UM DIFERENTE
        ProdutoComTamanho pt0 = new ProdutoComTamanho("Sapato",0,100.00,40);
        ProdutoComTamanho pt1 = new ProdutoComTamanho("Sapato de Couro",0,100.00,40);
        ProdutoComTamanho pt2 = new ProdutoComTamanho("Mocassim",1,250.00, 37);

        // INICIALIZA O CARRINHO
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // ADICIONA TODOS PRODUTOS NO CARRINHO
        carrinho.adicionaProduto(p0, 1);
        carrinho.adicionaProduto(p1, 2);
        carrinho.adicionaProduto(p2, 3);
        carrinho.adicionaProduto(pt0, 1);
        carrinho.adicionaProduto(pt1, 1);
        carrinho.adicionaProduto(pt2, 1);

        // PREÇO FINAL DO CARRINHO
        System.out.println("O preço final do carrinho é: R$" + carrinho.calculaTotal());
    }
}