import java.util.HashMap;

public class CarrinhoDeCompra {

    static HashMap<Integer, Pizza> ListaCarrinho = new HashMap <Integer, Pizza>();

    int addPizza(Pizza p){

        if(p.getPreco() > 0){
        ListaCarrinho.put(p.id, p);
        return 0;}
        else {System.out.println("Não é possível adicionar a pizza " + p.id
                + " pois não há nenhum ingrediente");
        return 404;}
    }

    int totalCarrinho(){
        int valorTotal = 0;
        for (Pizza value : ListaCarrinho.values()) {
            valorTotal += value.getPreco();
        }
        return valorTotal;
    }


}
