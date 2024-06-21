import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoDeComprasTest {

    CarrinhoDeCompras c1 = new CarrinhoDeCompras();

    Produto p1 = new Produto("Tenis 1", 0, 200);
    Produto p2 = new Produto("Tenis 2", 0, 200);
    Produto p3 = new Produto("Tenis 3", 1, 300);

    ProdutoComTamanho p1t = new ProdutoComTamanho("Tenis 1", 0, 200, 40);
    ProdutoComTamanho p2t = new ProdutoComTamanho("Tenis 2", 0, 250, 37);
    ProdutoComTamanho p3t = new ProdutoComTamanho("Tenis 3", 1, 250, 37);


     public void zeraCarrinho(){

    }

    @Test
    public void adicionaUmProduto(){
        c1.adicionaProduto(p1,10);
        assertEquals(c1.listaCarrinho.get(p1), 10);
    }

    @Test
    public void adicionaeRemoveUmProduto(){
        adicionaUmProduto();
        c1.removeProduto(p1, 1);
        assertEquals(c1.listaCarrinho.get(p1), 9);
    }

    @Test
    public void precoProdutosIguais(){
        c1.adicionaProduto(p1,1);
        c1.adicionaProduto(p2,3);
        assertEquals(800, c1.calculaTotal());
    }


    @Test
    public void precoProdutosComTamanhoIguais(){
        c1.adicionaProduto(p1t,1);
        c1.adicionaProduto(p2t,3);
        assertEquals(950, c1.calculaTotal());
    }

    @Test
    public void calculaOTotal(){
        c1.adicionaProduto(p1,1);
        c1.adicionaProduto(p2,2);
        c1.adicionaProduto(p3,3);
        c1.adicionaProduto(p1t,1);
        c1.adicionaProduto(p2t,3);
        c1.adicionaProduto(p3t,2);
        assertEquals(2950.00, c1.calculaTotal());
    }





}

