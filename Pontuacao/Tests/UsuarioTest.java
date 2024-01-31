import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest extends Object {
    @Test
    public void pontosCriarTopico(){
        Usuario u = new Usuario();
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);
    }

    @Test
    public void pontosCriarTopicoVip(){
        Usuario u = new Usuario();
        u.vip = true;
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 25);
    }

    @Test
    public void pontosCriarTopicoBonusdoDia(){
        Usuario u = new Usuario();
        u.nome = "Guerra";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 15);
    }

    @Test
    public void pontosCriarTopicoVipBonusdoDia(){
        Usuario u = new Usuario();
        u.nome = "Guerra";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 50);
    }

}