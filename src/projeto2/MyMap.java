/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import java.util.HashMap;
import java.util.Map;
public class MyMap {
  public static void main(String[] args) {
    Map<String,String> colecaoMap = new HashMap<String, String>();
    
    colecaoMap.put("chave1", "João");
    colecaoMap.put("chave2", "Maria");
    colecaoMap.put("chave3", "José");
    colecaoMap.put("chave4", "Fernanda");
    colecaoMap.put("chave5", "Ricardo");
    colecaoMap.put("chave6", "Pedro");
    
      System.out.println(colecaoMap);
  }
}