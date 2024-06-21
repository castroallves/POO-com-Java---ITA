public class ProdutoComTamanho extends Produto {

    public int tamanho;

    public ProdutoComTamanho(){
    }

    public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ProdutoComTamanho){
            return this.codigo == ((ProdutoComTamanho) obj).codigo && this.tamanho == ((ProdutoComTamanho) obj).tamanho;
        }
        return false;
    }

    @Override
    public int hashCode() {

        return this.codigo + this.tamanho;
    }
}
