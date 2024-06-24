import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Pessoa {
    Locale loc = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);

    private Date dataDeNascimento;

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date d) {
        this.dataDeNascimento = d;
    }

    public int getIdade(){
        int ano = Relogio.agora().getYear() - this.getDataDeNascimento().getYear();
        if(Relogio.agora().getMonth() >= getDataDeNascimento().getMonth() && Relogio.agora().getDate() > getDataDeNascimento().getDate())
        return ano-1;
        else return ano;
        //return (idadems / 1000 /60 / 60 / 24 );
    }

}
