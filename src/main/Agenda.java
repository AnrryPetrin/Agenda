/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import ArvoreBinaria.Node;
import ArvoreBinaria.Tree;
import java.util.Calendar;


/**
 *
 * @author anrry
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // teste
        // testando como seria o funcionamento das datas na agenda
        
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        
        c1.set(2020, 12, 12);
        c2.set(2021, 12, 12);
        c3.set(2022, 12, 12);
        
        Node node1 = new Node(c1, "Médico");
        Node node2 = new Node(c1, "Psico");
        Node node3 = new Node(c1, "Fisio");
        
        Tree tree = new Tree();
        
        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        
        System.out.println(node1);
        System.out.println(tree.buscaAgendamento(node1, "Médico"));
        
        

    }

    
}
