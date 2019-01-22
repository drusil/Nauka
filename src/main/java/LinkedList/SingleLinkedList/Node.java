package LinkedList.SingleLinkedList;

public class Node {
  private String data;
  private Node next;

  boolean hasNext() {
    if (next == null) {
      return false;
    } else {
      return true;
    }
  }

  private Node getNext() {
    return next;
  }

  private void setNextNode(Node node) {
    next = node;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Node(String data) {
    this.data = data;

  }

  public void addData(String data) {
    Node nextNode = this;
    while (hasNext()) {
      nextNode = getNext();
    }
    nextNode.setNextNode(new Node(data));
  }

  public void removeNext() {
    if (next.hasNext()) {
      next = next.getNext();
    } else {
      next = null;
    }
  }

}
