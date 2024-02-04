public class Paciente {

    double peso, altura;

    Paciente(double peso, double altura){

        this.peso = peso;
        this.altura = altura;
    }

    double calcularIMC(double peso, double altura){

        double imc = peso / (altura*altura);

        return imc;
    }

    double diagnostico(){

        double imc = calcularIMC(this.peso,this.altura);

        if(imc < 16) System.out.print("Baixo peso muito grave\n");
        else if(imc >= 17 && imc <=18.49)System.out.print("Baixo peso\n");
        else if(imc >= 18.50 && imc <=24.99)System.out.print("Peso normal\n");
        else if(imc >= 25 && imc <=29.99)System.out.print("Sobrepeso\n");
        else if(imc >= 30 && imc <=34.99)System.out.print("Obesidade\n");
        else if(imc >= 35 && imc <=39.99)System.out.print("Obesidade grau II\n");
        else if(imc >= 40)System.out.print("Obesidade grau III\n");

        return imc;
    }

}
