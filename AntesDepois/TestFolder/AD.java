import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class AD {

    @BeforeEach
    public void before(){
        System.out.println("Before");
    }

    @BeforeAll
     public static void beforeclass(){
        System.out.println("Before");
    }

    @AfterAll
    public static void afterclass(){
        System.out.println("AfterClass");
    }

    @AfterEach
    public void after(){
        System.out.println("After");
    }

    @Test
    public void teste1(){
        System.out.println("Teste 1");
    }

    @Test
    public void teste2(){
        System.out.println("Teste 2");
    }

    @Test
    public void teste3(){
        System.out.println("Teste 3");
    }
}
