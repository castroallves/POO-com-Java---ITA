public class Principal {
    public static void main(String[] args) {

        Paciente p1 = new Paciente(69, 1.74);
        Paciente p2 = new Paciente(50, 1.7);
        Paciente p3 = new Paciente(80, 1.6);

        p1.diagnostico();
        System.out.println(p1.diagnostico());
        p2.diagnostico();
        p3.diagnostico();

    }
}