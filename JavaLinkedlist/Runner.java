package JavaLinkedlist;

public class Runner {
  
  public static void main(String[] args){
    Linkedlist list = new Linkedlist();
    list.insert(13);
    list.insert(23);
    list.insert(45);
    list.insert(14);
    list.insertAtstart(26);
    list.insertAt(2,22);
    list.insertAt(0, 10);
    list.delete(3);
    list.show();
  }

}
