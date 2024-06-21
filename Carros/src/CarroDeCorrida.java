public abstract class CarroDeCorrida {
    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    public CarroDeCorrida(String nome, int  velocidadeMaxima) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    public abstract void acelerar();

    public void frear(){

        velocidade = velocidade / 2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade(){
        return velocidade;
    }

    void imprimir(){
        System.out.println("O carro "+nome+" está a velocidade de " +
                +getVelocidade()+  " km/h");
    }
}
