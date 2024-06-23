public interface FormatadorNome {

    String formatarNome(String nome, String sobrenome);

    String formatarNome(String nome, String sobrenome, Autoridade.sexo s);

    String formatarNome(String nome, String sobrenome, String titulo);
}
