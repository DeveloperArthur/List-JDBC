package projeto2;

import java.util.*;

public class ColecaoHashSet {

    public static void main(String[] args) {
        Set conjunto = new HashSet();  // cria uma coleção do tipo conjunto
        conjunto.add("banana");
        conjunto.add("laranja");
        conjunto.add("limão");
        conjunto.add("banana");//esse item será desprezado, pois é repetido
        conjunto.add("limão");//esse item será desprezado, pois é repetido
        Iterator ite1 = conjunto.iterator();
        while (ite1.hasNext()) {
            System.out.println(ite1.next());   //mostra apenas 3 itens e não 5
        }
    }
}
