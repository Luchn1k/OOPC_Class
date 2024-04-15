package day_9;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    private Node head;

    public  void insertAtBeginning(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

}

class TestLinkedList{
    public static void main(String[] args) {
        LinkedList linkedList =  new LinkedList();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(40);
        System.out.println("Linked List : ");
        linkedList.display();
    }
}
