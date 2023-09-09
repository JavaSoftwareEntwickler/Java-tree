
public class MainTest {

    public static void main(String[] args) {
        Nodo nodoRoot = new Nodo();
        Nodo nodo1 = new Nodo("-2");
        Nodo nodo2 = new Nodo("5");
        Nodo nodo3 = new Nodo("6");
        Nodo nodo4 = new Nodo("4");
        Nodo nodo5 = new Nodo("3");


        nodoRoot.setDestro(nodo1);
        nodo1.setDestro(nodo4);
        nodo1.setSinistro(nodo5);
        nodo5.setDestro(nodo3);
        nodo5.setSinistro(nodo2);

        System.out.println(new Nodo().somma(nodoRoot));

    }

}
