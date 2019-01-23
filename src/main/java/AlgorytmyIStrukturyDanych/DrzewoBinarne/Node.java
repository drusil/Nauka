package AlgorytmyIStrukturyDanych.DrzewoBinarne;

public class Node {
  Node left;
  Node right;
  Node parent;
  int key;
  String data;

  public Node(Node parent, int key) {
    this.parent = parent;
    this.key = key;
  }

  public Node(Node parent, int key,String data) {
    this(parent,key);
    this.data = data;
  }

  public Node(int key, String data){
    this.key = key;
    this.data = data;
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

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public int getKey() {
    return key;
  }

  public void add(Node node,int key){

      if(this.key <= key ){
      if(left != null){
        left.add(node,key);
      }else {
        left = node;
      }
    }else{
      if(right != null){
        right.add(node,key);
      }else {
        right = node;
      }
    }
  }


  @Override
  public String toString() {
    return "key:" + key + " data: " + data;
  }
}
