package com.mycompany.exercicio1;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class Exercicio1 {
    Node root;

    // Pré-ordem: raiz → esquerda → direita
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Em-ordem: esquerda → raiz → direita
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    // Pós-ordem: esquerda → direita → raiz
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Em nível (Level-order): por nível da árvore
    void levelOrder(Node node) {
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        Exercicio1 tree = new Exercicio1();

        // Construindo a árvore corrigida
        tree.root = new Node(12);
        tree.root.left = new Node(6);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(7);
        tree.root.right.right = new Node(13); // Apenas o 13 como filho de 15

        System.out.print("Pré-ordem: ");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.print("Em-ordem: ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.print("Pós-ordem: ");
        tree.postOrder(tree.root);
        System.out.println();

        System.out.print("Em nível: ");
        tree.levelOrder(tree.root);
        System.out.println();
    }
}
