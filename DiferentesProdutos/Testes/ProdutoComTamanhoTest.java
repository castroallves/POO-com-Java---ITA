import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoComTamanhoTest {

    ProdutoComTamanho p1 = new ProdutoComTamanho("Tenis 1", 0, 200, 40);
    ProdutoComTamanho p2 = new ProdutoComTamanho("Tenis 2", 0, 259, 40);
    ProdutoComTamanho p3 = new ProdutoComTamanho("Tenis 1", 1, 259, 40);
    ProdutoComTamanho p4 = new ProdutoComTamanho("Tenis 3", 0, 259, 37);

    @Test
    public void equals(){

        assertEquals(p1,p2);
        assertNotEquals(p1,p3);
    }

    @Test
    public void hashcode(){
        assertEquals(p1.hashCode(),p2.hashCode());
        assertNotEquals(p1.hashCode(),p4.hashCode());
    }



}