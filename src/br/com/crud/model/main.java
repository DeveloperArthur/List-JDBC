package br.com.crud.model;
import br.com.crud.model.Cliente;
import br.com.crud.model.Dao;
import java.util.ArrayList;
import java.util.Iterator;

public class main {
 
    public static void main(String[] args) {
        
        
        
        Cliente exemploCliente = new Cliente();
        
        
        exemploCliente.setNome("Arthur");
        exemploCliente.setCep("0482450");
        exemploCliente.setCidade("sao paulo");
        exemploCliente.setCpf("491503849/00");
        exemploCliente.setEndereco("grajau");
        exemploCliente.setEstado("sao paulo");
        exemploCliente.setGenero("macho");
        exemploCliente.setId(2);
        exemploCliente.setIdade(19);
        exemploCliente.setTelefone("966402850");
        
        DaoCliente banco = new DaoCliente();
        
        banco.cadastrarCliente(exemploCliente);
        
        ArrayList teste = new ArrayList();
        teste = (ArrayList) banco.buscarClientes();
        
        Iterator ite1 = teste.iterator();
        while (ite1.hasNext()) {     //enquanto houver dados exibir, hasNext() verifica
            System.out.println(ite1.next());    //exibe o próximo elemento da lista, next()
        }
        
        
        
        
    }
    
    
}
