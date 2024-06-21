import java.util.HashMap; // import the HashMap class
import java.util.Map;

public class CarrinhoDeCompras {

    private double valorTotal = 0;

    HashMap<Produto, Integer> listaCarrinho = new HashMap<Produto, Integer>();

    public Integer adicionaProduto(Produto prod, int qtd){
        if(listaCarrinho.get(prod) == null){
            listaCarrinho.put(prod, qtd);}

        else if(listaCarrinho.containsKey(prod)){
            listaCarrinho.put(prod,listaCarrinho.get(prod) + qtd);}
        return listaCarrinho.get(prod);
    }

    public Integer removeProduto(Produto prod, int qtd){
        if(listaCarrinho.get(prod) == null){
            return null;}

        else if(listaCarrinho.containsKey(prod) && listaCarrinho.get(prod) >=qtd)
            listaCarrinho.put(prod,listaCarrinho.get(prod) - qtd);
            return listaCarrinho.get(prod);
    }

    public double calculaTotal(){
        for (Map.Entry<Produto, Integer> entry : this.listaCarrinho.entrySet()) {
            valorTotal += entry.getKey().preco * entry.getValue();
        }
        return  valorTotal;

    }


}
