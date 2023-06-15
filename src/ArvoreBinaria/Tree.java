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
        
        String day = String.valueOf(c.get(Calendar.DATE));
        String month =String.valueOf( c.get(Calendar.MONTH));
        
        if (c.get(Calendar.DATE) < 10) {
            day = "0" + c.get(Calendar.DATE); 
        } 
        if (c.get(Calendar.MONTH) < 10) {
            month = "0" + c.get(Calendar.MONTH); 
        }
        
        if (c.get(Calendar.MONTH) == 0) {
            return day + "/12/" + c.get(Calendar.YEAR) + "";
        }
        return day + "/" + month + "/" + c.get(Calendar.YEAR) + "";
    }

    // Método de busca em uma árvore binária para encontrar o nó correspondente ao agendamento
    public Node buscaAgendamento(Node currentNode, String tituloDesejado) {
        if (currentNode == null) {
            return null; // Agendamento não encontrado
        }

        if (currentNode.getTitle().equals(tituloDesejado)) {
            return currentNode; // Agendamento encontrado
        }

        Node leftResult = buscaAgendamento(currentNode.getLeft(), tituloDesejado);
        if (leftResult != null) {
            return leftResult; // Agendamento encontrado na subárvore esquerda
        }

        Node rightResult = buscaAgendamento(currentNode.getRight(), tituloDesejado);
        if (rightResult != null) {
            return rightResult; // Agendamento encontrado na subárvore direita
        }

        return null; // Agendamento não encontrado
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
