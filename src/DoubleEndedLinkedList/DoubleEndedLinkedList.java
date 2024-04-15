package DoubleEndedLinkedList;


class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
    }
}


public class DoubleEndedLinkedList {
    private  Node head;
    private  Node tail;

    public  void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(tail ==  null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void  displayForward(){
        Node current = head;
        System.out.println("Forward ");
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

}

class Main{
    public static void main(String[] args) {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.insertAtEnd(10);
        doubleEndedLinkedList.insertAtEnd(20);
        doubleEndedLinkedList.insertAtEnd(30);
        doubleEndedLinkedList.displayForward();
    }
}
