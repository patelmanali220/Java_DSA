package JavaLinkedlist;

public class Linkedlist {
  
Node head;

public void insert(int data){
Node node = new Node();
node.data = data;
node.next = null;

if(head==null){
  head = node;
}
else{
  Node n = head;
  while (n.next != null) {
    n = n.next;
  }
  n.next = node;
}

}


public void delete(int index){
  if(index == 0){
    head = head.next;
  }
  else{
    Node n = head;
    Node t = null;
    for(int i=0; i<index-1; i++){
      n = n.next;
    }
   t = n.next;
   n.next = t.next;
   t = null;
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

public void insertAtstart(int data){
  Node node = new Node();
  node.data = data;
  node.next = null;
  node.next = head;
  head = node;
  }

  public void insertAt(int index, int data){
    Node node = new Node();
    node.data = data;
    node.next = null;

    if(index == 0){
     node.next = head;
     head = node;
    }
    else{
    Node n = head;
    for(int i=0; i<index-1; i++){
      n = n.next;
    }
    node.next = n.next;
    n.next = node;
   }
  }

}



