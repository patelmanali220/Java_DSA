package DoublyLinkedlist;

public class Linkedlist {
  Node head;
  Node tail;

  public void insert(int data){
    Node node = new Node();
    node.data = data;
    node.next = null;
    node.prev = null;

    if(head == null){
      head = node;
      tail = node;
    }
    else{
      Node n = head;
      while (n.next!=null) {
        n = n.next;
      }
      n.next = node;
      node.prev = n;
      
    }
  }

  public void show(){
    Node node = head;
    while(node.next!=null){
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);
  }

}
