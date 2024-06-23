import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoridadeTest {

    Autoridade a1 = new Autoridade("Dom","Pedro", "Castro", Autoridade.sexo.Masculino);
    Autoridade a2 = new Autoridade("Dona","Inês", "de Castro", Autoridade.sexo.Feminino);

    @Test
    void getTratamentoInf() {
        String msg = a1.getTratamento(Autoridade.tratamento.Informal);
        System.out.println(msg);
    }

    @Test
    void getTratamentoMascResp() {
        String msg = a1.getTratamento(Autoridade.tratamento.Respeitoso);
        System.out.println(msg);
    }

    @Test
    void getTratamentoFemResp() {
        String msg = a2.getTratamento(Autoridade.tratamento.Respeitoso);
        System.out.println(msg);
    }

    @Test
    void getTratamentoMascComTitulo() {
        String msg = a1.getTratamento(Autoridade.tratamento.ComTitulo);
        System.out.println(msg);
    }

    @Test
    void getTratamentoFemComTitulo() {
        String msg = a2.getTratamento(Autoridade.tratamento.ComTitulo);
        System.out.println(msg);
    }


}