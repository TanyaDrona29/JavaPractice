package JavaPractice.LinkedList;

public class Definition {
    Node head;
    //inserting element to linked list at the beginning

    public void insertAtTheBeg(int newData){
        Node newNode = new Node(newData);
        newNode.setNext(head);
        head = newNode;
    }

    //inserting element to linked list at the end

    public void insertAtTheEnd(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = new Node(newData);
            return;
        }
        newNode.setNext(null);
        Node temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    //printing elements of linked list

    public void printList(){
        System.out.println("printing list---");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.getNext();
            if(temp != null){
                System.out.print("-->");
            }
        }
    }

    //deleting first node

    public Node deleteFirst(){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        return temp;
    }
}
