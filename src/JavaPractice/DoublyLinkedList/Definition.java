package JavaPractice.DoublyLinkedList;

public class Definition {
    Node head;
    Node tail;

    //inserting elements at the begning of the list
    public boolean isEmpty(){
        return head == null;
    }
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
    public void printList(){
        System.out.println("printing list -->");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() + "-->");
            temp = temp.getNext();
        }
        System.out.print("null");
    }
}
