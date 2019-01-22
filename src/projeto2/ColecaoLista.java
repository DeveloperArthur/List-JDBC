/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import java.util.*;
public class ColecaoLista {
    public static void main(String[] args) {
        List listaDesordenada = new ArrayList();     //cria uma coleção do tipo lista e adiciona dados
        listaDesordenada.add("Renato");
        listaDesordenada.add("Karoline");
        listaDesordenada.add("Lucas");
        listaDesordenada.add("Andrea");
        listaDesordenada.add("Margarida");
        Iterator ite1 = listaDesordenada.iterator();   //cria uma iteração com os elementos da lista
 
        while (ite1.hasNext()) {     //enquanto houver dados exibir, hasNext() verifica
            System.out.println(ite1.next());    //exibe o próximo elemento da lista, next()
        }
     }
}