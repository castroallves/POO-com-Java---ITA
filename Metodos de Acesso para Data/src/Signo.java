import java.util.Calendar;
import java.util.Date;

abstract class Signo {

    public String getSigno(Date nascimento) {
        if ((nascimento.getMonth() == 2 && nascimento.getDate() >= 21) || (nascimento.getMonth() == 3 && nascimento.getDate() <= 20)) {
            return "Áries";
        } else if ((nascimento.getMonth() == 3 && nascimento.getDate() >= 21) || (nascimento.getMonth() == 4 && nascimento.getDate() <= 19)) {
            return "Touro";
        } else if ((nascimento.getMonth() == 4 && nascimento.getDate() >= 20) || (nascimento.getMonth() == 5 && nascimento.getDate() <= 20)) {
            return "Gêmeos";
        } else if ((nascimento.getMonth() == 5 && nascimento.getDate() >= 21) || (nascimento.getMonth() == 6 && nascimento.getDate() <= 21)) {
            return "Câncer";
        } else if ((nascimento.getMonth() == 6 && nascimento.getDate() >= 22) || (nascimento.getMonth() == 7 && nascimento.getDate() <= 23)) {
            return "Leão";
        } else if ((nascimento.getMonth() == 7 && nascimento.getDate() >= 24) || (nascimento.getMonth() == 8 && nascimento.getDate() <= 23)) {
            return "Virgem";
        } else if ((nascimento.getMonth() == 8 && nascimento.getDate() >= 24) || (nascimento.getMonth() == 9 && nascimento.getDate() <= 23)) {
            return "Libra";
        } else if ((nascimento.getMonth() == 9 && nascimento.getDate() >= 24) || (nascimento.getMonth() == 10 && nascimento.getDate() <= 23)) {
            return "Escorpião";
        } else if ((nascimento.getMonth() == 10 && nascimento.getDate() >= 24) || (nascimento.getMonth() == 11 && nascimento.getDate() <= 22)) {
            return "Sagitário";
        } else if ((nascimento.getMonth() == 11 && nascimento.getDate() >= 23) || (nascimento.getMonth() == 0 && nascimento.getDate() <= 22)) {
            return "Capricórnio";
        } else if ((nascimento.getMonth() == 0 && nascimento.getDate() >= 23) || (nascimento.getMonth() == 1 && nascimento.getDate() <= 20)) {
            return "Aquário";
        } else if ((nascimento.getMonth() == 1 && nascimento.getDate() >= 21) || (nascimento.getMonth() == 2 && nascimento.getDate() <= 19)) {
            return "Peixes";
        }
        return "Data inválida";
    }
}