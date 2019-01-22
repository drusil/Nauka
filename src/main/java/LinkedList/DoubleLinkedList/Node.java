package LinkedList.DoubleLinkedList;

public class Node {
  private String data;
  private Node next;
  private Node previous;

  public Node(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  boolean hasNext(){
    if(next!= null){
      return true;
    } else {
      return false;
    }
  }

  boolean hasPrevious(){
    if(previous!= null){
      return true;
    }else {
      return false;
    }
  }

  private Node getNext() {
    return next;
  }

  private Node getPrevious() {
    return previous;
  }

  private void setNext(Node next) {
    this.next = next;
  }

  private void setPrevious(Node previous) {
    this.previous = previous;
  }

  public void addData(String data){
    Node nextNode = this;
    while (hasNext()){
      nextNode = getNext();
    }
    nextNode = new Node(data);
  }

  public Node removeThis(){
    if(hasPrevious()&&hasNext()){
      getPrevious().setNext(getNext());
      return getPrevious();
    } else if(hasPrevious()&& !hasNext()){
      getPrevious().setNext(null);
      return getPrevious();
    } if(hasNext()&&!hasPrevious()){
      getNext().setPrevious(null);
      return getNext();
    }else {
      return null;
    }
  }
}
