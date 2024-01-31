//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.potencia = 160;
        c1.nome = "Prelude";
        c1.velocidade = 0;

        c1.acelerar();
        c1.acelerar();

        c1.imprimir();

    }
}