public class Produto {

    public String nome;
    public int codigo;
    public double preco;

    public Produto(String nome, int codigo, double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public Produto(){
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Produto){
            return this.codigo == ((Produto) obj).codigo;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.codigo;
    }
}

