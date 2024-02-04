import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    //Baixo peso muito grave
    @org.junit.jupiter.api.Test
    void testeBaixoPesoMG() {
        Paciente p = new Paciente(50, 1.8);
        assertEquals(15.4,p.diagnostico(),0.1);
    }

    //Baixo peso grave
    @org.junit.jupiter.api.Test
    void testeBaixoPesoG() {
        Paciente p = new Paciente(46.3, 1.7);
        assertEquals(16,16,0.1);
    }

    //Baixo peso
    @org.junit.jupiter.api.Test
    void testeBaixoPeso() {
        Paciente p = new Paciente(46.3, 1.7);
        assertEquals(16,16,0.1);
    }

    //Peso Normal
    @org.junit.jupiter.api.Test
    void testePesoNormal() {
        Paciente p = new Paciente(60, 1.7);
        assertEquals(20.7,20.7,0.1);
    }

    //Sobrepeso
    @org.junit.jupiter.api.Test
    void testeSobrepeso() {
        Paciente p = new Paciente(80, 1.7);
        assertEquals(27,27,1);
    }

    //Obesidade Grau I
    @org.junit.jupiter.api.Test
    void testeObesidadeGrauI() {
        Paciente p = new Paciente(100, 1.8);
        assertEquals(30.8,30.8,0.1);
    }

    //Obesidade Grau II
    @org.junit.jupiter.api.Test
    void testeObesidadeGrauII() {
        Paciente p = new Paciente(120, 1.85);
        assertEquals(35,35,0.06);
    }

    //Obesidade Grau III
    @org.junit.jupiter.api.Test
    void testeObesidadeGrauIII() {
        Paciente p = new Paciente(140, 1.85);
        assertEquals(40.9,40.9,0.001);
    }


}