public class Principal {

    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        p.empilhar("Eduardo");
        p.empilhar("Maria");
        p.empilhar("José");
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        Object[] arrayElementos = p.getElementos();
        arrayElementos[2] = "OUTRO";

        System.out.println(p.desempilhar());
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println(p.getElementos().length);
    }
}
