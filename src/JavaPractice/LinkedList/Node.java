package JavaPractice.LinkedList;

public class Node {
    private int data;
    private Node next;

    //constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    //getter and setter
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return next;
    }
}
