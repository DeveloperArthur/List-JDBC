package br.com.crud.model;
 
import com.mysql.jdbc.PreparedStatement;
import com.sun.istack.internal.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;


public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private int idade;
    private String endereco;
    private String cidade;
    private String estado;  
    private String cep;
    private PreparedStatement stmt;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getCpf() {
        return cpf;
    }
 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
    public String getGenero() {
        return genero;
    }
 
    public void setGenero(String genero) {
        this.genero = genero;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public String getEndereco() {
        return endereco;
    }
 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    public String getCidade() {
        return cidade;
    }
 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    public String getCep() {
        return cep;
    }
 
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
    
    
}