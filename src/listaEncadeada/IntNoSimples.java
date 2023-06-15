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
    
 }

