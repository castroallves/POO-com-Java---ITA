import static org.junit.jupiter.api.Assertions.*;

class TesteRegistroPontos
{
    public void test(){
        Usuario u = new Usuario();
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);
    }

}