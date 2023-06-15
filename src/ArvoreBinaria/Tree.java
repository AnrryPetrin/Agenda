/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArvoreBinaria;

import java.util.Calendar;

public class Tree {
    private Node root;

    public void insert(Node node) {
        this.root = insertRecursion(root, node);
    }
    
    public Node insertRecursion(Node root, Node node) {
        if (root == null) {
            root = node;
            return root;
        }

        if (node.date.compareTo(root.date) == -1) {
            root.left = insertRecursion(root.left, node);
        } else if (node.date.compareTo(root.date) == 1 || node.date.compareTo(root.date) == 0) {
            root.right = insertRecursion(root.right, node);
        }

        return root;
    }
    
    public String inOrder(Node place, String message) {                      // Algoritmo de navegação em ordem
        
        if (place.left != null) {                   // Se o filho à esquerda não está vazio
            message = inOrder(place.left, message);                    // Pula para o filho à esquerda pela recursividade
        }
        message += dateToString(place.date) + " - " + place.title + "<br><br>";         // Depois imprime a informação do nó

        if (place.right != null) {                  // Se filho à direita não está vazio
            message = inOrder(place.right, message);                   // Pula para o filho à direita pela recursividade
        }
        return message;
    }
    
    public String dateToString(Calendar c) {
        if (c.get(Calendar.MONTH) == 0) {
           return c.get(Calendar.DATE) + "/12/" + c.get(Calendar.YEAR) + ""; 
        }
        return c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR) + "";
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    
    
}
