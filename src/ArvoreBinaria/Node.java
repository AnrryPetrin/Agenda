/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArvoreBinaria;

import java.util.Calendar;

public class Node {
    
    Calendar date;                   // Informação tipo Calendar
    String title;
    Node left;                  // Filho à esquerda
    Node right;                 // FIlho à direita
    
    public Node(Calendar date, String title) {            // Inicializa os atributos da classe
        this.date = date;       // Inicializa a informação com o parâmetro recebido
        this.title = title;
        this.left = null;       // Inicializa o filho à esquerda como vazio
        this.right = null;      // Inicializa o filho à direita como vazio
    }
    
    public Node() {
        
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    
    
}
