package AlgorytmyIStrukturyDanych.DrzewoBinarne;

import java.util.*;

public class DrzewoBinarne {

  public static void main(String[] args) {
String root = "Annuntio";
    Node binaryTree = new Node(root.hashCode(), "Annuntio");

    String text = "vobis gaudium magnum habemus Papam \n" +
        "Eminentissimum ac Reverendissimum Dominum \n" +
        "Dominum";

    Arrays.asList(text.split(" ")).stream().forEach(s -> treeInsert(binaryTree, new Node(s.hashCode(), s)));
    System.out.println("Print whole tree:");
    inorderTreeWalka(binaryTree);

    System.out.println("Find key 6:");
    System.out.println(treeSearch(binaryTree,new String("Reverendissimum").hashCode()));

    System.out.printf("%n  %nMax: %s  %nMin:%s",findMax(binaryTree),findMin(binaryTree));

  }

  public static void inorderTreeWalka(Node node) {
    if (node != null) {
      inorderTreeWalka(node.getLeft());
      System.out.println(node);
      inorderTreeWalka(node.getRight());
    }
  }

  public static Node treeInsert(Node root, Node insertedNode) {

    if (root == null) {
      return insertedNode;
    }

    Node last = null;
    Node next = root;

    while (next != null) {
      last = next;

      if (insertedNode.getKey() <= next.getKey()) {
        next = next.getLeft();
      } else {
        next = next.getRight();
      }
    }

    insertedNode.setParent(last);

    if (insertedNode.getKey() <= last.getKey()) {
      last.setLeft(insertedNode);
    } else {
      last.setRight(insertedNode);
    }
    return root;
  }

  public static Node treeSearch(Node node, int key) {
    if (node == null || key == node.getKey()) {
      return node;
    }
    if (key <= node.getKey()) {
      return treeSearch(node.getLeft(), key);
    } else {
      return treeSearch(node.getRight(), key);
    }
  }

  public static Node findMin(Node root){
    Node last = null;
    Node next = root;
    while (next != null){
      last = next;
      next = next.getLeft();
    }
    return last;
  }

  public static Node findMax(Node root){
    Node last = null;
    Node next = root;
    while (next != null){
      last = next;
      next = next.getRight();
    }
    return last;
  }

 
}

