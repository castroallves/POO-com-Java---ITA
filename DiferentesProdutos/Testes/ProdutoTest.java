import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto p1 = new Produto("Tenis 1", 0, 200);
    Produto p2 = new Produto("Tenis 2", 0, 300);
    Produto p3 = new Produto("Sapato", 1, 250);

    @Test
    public void ProdutosIguais(){
        assertEquals(p1,p2);
    }

    @Test
    public void ProdutosDiferentes(){
        assertNotEquals(p1,p3);
    }

    @Test
    public void hashcode(){
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1.hashCode(), p3.hashCode());
    }


}