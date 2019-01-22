/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import java.util.*;
public class ColecaoSort {
public static void main(String[] args) {
   List listaDesordenada = new ArrayList(); //cria uma coleção do tipo lista e adiciona dados
   listaDesordenada.add("Renato");
   listaDesordenada.add("Karoline");
   listaDesordenada.add("Lucas");
   listaDesordenada.add("Andrea");
   listaDesordenada.add("Margarida");
 
   System.out.println("Desordenado:");    // imprima a lista desordenada
   Iterator ite1 = listaDesordenada.iterator(); //cria o iterador
   while (ite1.hasNext()) {
      System.out.println(ite1.next());
   }
   System.out.println("\nOrdenado:");   // imprima a lista ordenada
   Collections.sort(listaDesordenada);  //método que organizará a lista, Collections.sort
   Iterator ite2 = listaDesordenada.iterator(); // cria o Iterador
   while (ite2.hasNext()) {
      System.out.println(ite2.next());
   }
  }
}