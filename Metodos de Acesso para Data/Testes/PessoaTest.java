import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest extends Signo {

    static int ref = 1900;
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();
    Pessoa p3 = new Pessoa();

    @Test
    public void ariano(){
        p1.setDataDeNascimento(new Date(1998 - ref,Calendar.APRIL,20));
        assertEquals("Áries", getSigno(p1.getDataDeNascimento()));
        System.out.println("Idade " + p1.getIdade());
    }

    @Test
    public void leonino(){
        p2.setDataDeNascimento(new Date(2001 - ref,Calendar.AUGUST,20));
        assertEquals("Leão", getSigno(p2.getDataDeNascimento()));
        System.out.println("Idade " + p2.getIdade());
    }

    @Test
    public void pisciano(){
        p1.setDataDeNascimento(new Date(2010 - ref,Calendar.MARCH,15));
        assertEquals("Peixes", getSigno(p1.getDataDeNascimento()));
        System.out.println("Idade " + p2.getIdade());
    }

    @Test
    public void teste2(){
        p1.setDataDeNascimento(new Date(2010 - ref,Calendar.JUNE,24));
        System.out.println("Idade " + p1.getIdade());
    }
}