public class Autoridade implements FormatadorNome{

    public enum sexo {Masculino, Feminino};
    public enum tratamento {Informal, Respeitoso, ComTitulo};

    private String nome;
    private String sobrenome;
    private String titulo;
    private sexo s;

    public Autoridade(String titulo, String nome, String sobrenome, sexo s) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.s = s;
        this.titulo = titulo;
    }

    public String getTratamento(tratamento t){
        if(t == tratamento.Informal){
            return formatarNome(nome, sobrenome);
            }
        else if(t == tratamento.Respeitoso){
            return formatarNome(nome, sobrenome, s);
        }
        else if(t == tratamento.ComTitulo){
            return formatarNome(nome, sobrenome, titulo);
        }
        return "Erro";
}

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return nome;
    }

    @Override
    public String formatarNome(String nome, String sobrenome, sexo s) {
        if (s == sexo.Masculino){
            return "Sr. " + sobrenome;
        }
        else if (s == sexo.Feminino){
            return "Sra. " + sobrenome;
        }
        return "Formato Inválido";
    }

    @Override
    public String formatarNome(String nome, String sobrenome, String titulo) {
        return titulo +" " + nome + " " + sobrenome;
    }

}
