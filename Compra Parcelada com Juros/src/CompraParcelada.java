import java.lang.Math;

public class CompraParcelada extends Compra{

    private int parcelas;
    private double jurosMensal;

    public CompraParcelada(double valor, int parcelas, double juros){
        this.valorCompra = valor;
        this.parcelas = parcelas;
        this.jurosMensal = juros;
    }

    @Override
    public double total(){
        double montante = this.valorCompra * (Math.pow(1 + this.jurosMensal,this.parcelas));
        return montante;
    }


}
