import static org.junit.jupiter.api.Assertions.assertEquals;
public class CarroSoma extends CarroDeCorrida{

    private int potencia;

    public CarroSoma(String nome, int potencia, int  velocidadeMaxima) {
        super(nome, velocidadeMaxima);
        this.potencia = potencia;
    }

    @Override
    public void acelerar(){
        velocidade += potencia;
        if(getVelocidade() > velocidadeMaxima){
            velocidade = velocidadeMaxima;}
    }

}
