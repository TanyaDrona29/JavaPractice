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
    //temp holds the value of head
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
        System.out.println();
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

    //deleting last node
    public Node deleteLast(){
        //if condition true then either no elemnet is present in the list or only one element is present
        if(head == null || head.getNext()==null ){
            return head;
        }
        //temp holds the head value and previous for traversing to the second last element of the list
        Node temp = head;
        Node previous = null;
        while(temp.getNext() != null){
            previous = temp;
            temp = temp.getNext();
        }
        //previous points to null so that the last elemnet can be deleted
        previous.setNext(null);
        return temp;
    }

    //searching an elemnet in the list
    public boolean searchElement(int searchKey){
        Node temp = head;
        boolean response = false;
        while(temp != null){
            if(temp.getData() == searchKey){
                response = true;
                return response;
            }
            temp = temp.getNext();
        }
        return response;
    }
}
