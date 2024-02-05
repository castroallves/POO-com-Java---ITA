package Pacote;

import Pacote.Referencia;

public class OutraMesmoPacote {

    public void testeAcesso(){
        Referencia r = new Referencia();
        r.modificadorPublico = 0;
        r.modificadorProtegido = 0;
        r.modificadorDefault = 0;
    }
}
