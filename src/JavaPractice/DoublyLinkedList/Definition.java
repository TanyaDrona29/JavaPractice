package JavaPractice.DoublyLinkedList;

public class Definition {
    Node head;
    Node tail;

    //to check if list is empty
    public boolean isEmpty(){
        return head == null;
    }
    //inserting elements at the beginning of the list
    public void insertAtBeg(int newData){
        Node newNode = new Node(newData);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.setPrevious(newNode);
        }
        newNode.setNext(head);
        head = newNode;
    }
    //inserting elements at the end of the list
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
    }
    //deleting the first node
    public Node deleteFirst(){
        Node temp = head;
        if (isEmpty()) {
            System.out.println("list is empty");
        }
        //now if only one element is present in the list then we need to remove both the tail and head pointer
        //So we assign null value to tail
        else if(head == tail){
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        temp.setNext(null);
        return temp;
    }
    //printing elemnets from beginning
    public void printList(){
        System.out.println();
        System.out.println("printing list -->");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() + "-->");
            temp = temp.getNext();
        }
        System.out.print("null");
    }
}
