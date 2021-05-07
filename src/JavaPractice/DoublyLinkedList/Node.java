package JavaPractice.DoublyLinkedList;

public class Node {
    private int data;
    private Node next;
    private Node previous;

    //construtor
    public Node(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
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
    public void setPrevious(Node previous){
        this.previous = previous;
    }
    public Node getPrevious(){
        return previous;
    }

}
