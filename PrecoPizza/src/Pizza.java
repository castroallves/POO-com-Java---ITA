import jdk.dynalink.linker.LinkerServices;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Pizza {

    public static HashMap<String, Integer> listaIngredienteTotal = new HashMap<String, Integer>();

    HashMap<String, Integer> listaIngredienteUnit = new HashMap<String, Integer>();

    static int counter = 0;
    int id = 0;

    Pizza(){
        this.id = counter;
        counter++;
    }

    public void adicionaIngrediente(int qt, String igd){

        this.listaIngredienteUnit.put(igd, qt);
        contabilizaIngrediente(qt, igd);

    }

    public void zeraIngrediente(){

        this.listaIngredienteUnit = new HashMap<>();

    }

    public void contabilizaIngrediente(int qt, String igd){

        listaIngredienteTotal.put(igd, qt);
    }

    public int getPreco() {
        int contador = 0;
        int preco = 0;
        for (Map.Entry<String, Integer> entry : this.listaIngredienteUnit.entrySet()) {
            contador += entry.getValue();
        }

        if(contador <= 2 && contador > 0) preco = 15;
        else if(contador >=3 && contador <=5) preco = 20;
        else if(contador > 5) preco = 23;

        return preco;
    }

    public static void ingredienteTotal() {
        System.out.println("Quantidade utilizada de cada ingrediente:");
        for (Map.Entry<String, Integer> entry : listaIngredienteTotal.entrySet()) {
            System.out.println(entry.getValue() + " unidade(s)" + " de " + entry.getKey());
        }
    }

}
