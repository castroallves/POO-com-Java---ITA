import static org.junit.jupiter.api.Assertions.assertEquals;
public class Carro extends CarroDeCorrida{

    private int potencia;

    public Carro(String nome, int potencia,int  velocidadeMaxima) {
        super(velocidadeMaxima, nome);
        this.potencia = potencia;
    }

    @Override
    public void acelerar(){
        velocidade += potencia;
        if(getVelocidade() > velocidadeMaxima){
            velocidade = velocidadeMaxima;}
    }

}
