public class Compra {

    protected double valorCompra;

    public void Compra(double valor){
        this.valorCompra = valor;
    }

    public double total(){
        return this.valorCompra;
    }
}
