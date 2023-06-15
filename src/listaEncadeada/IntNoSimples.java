/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEncadeada;

/**
 *
 * @author bruno
 */
public class IntNoSimples {
    
    int valor;
    IntNoSimples prox;
    String titulo;
    String prioridade;
    
    public IntNoSimples(int ValorNo, String titulo, String prioridade){
        valor = ValorNo;
        this.titulo = titulo;
        this.prioridade = prioridade;
        prox = null;
    }
    
    public void editarTarefa(int novoValorNo, String novoTitulo, String novaPrioridade) {
        valor = novoValorNo;
        this.titulo = novoTitulo;
        this.prioridade = novaPrioridade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public IntNoSimples getProx() {
        return prox;
    }

    public void setProx(IntNoSimples prox) {
        this.prox = prox;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
 }

