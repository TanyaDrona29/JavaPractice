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

    //searching an element in the list
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
    //reversing a linked list
    public Node reverse(Node node){
        if(head == null){
            System.out.println("list is empty");
        }
        Node temp = head;
        Node previous = null;
        Node next = null;
        while(temp != null){
            next = temp.getNext();
            temp.setNext(previous);
            previous = temp;
            temp = next;
        }
        node = previous;
        return previous;
    }
    //reverse the elements in groups of given size
    public Node reverseInGroup(Node head,int k){
        if(head == null)
            System.out.println("list is empty");
        Node temp = head;
        Node previous = null;
        Node next = null;
        int count = 0;
        while(count < k && temp != null){
            next = temp.getNext();
            temp.setNext(previous);
            previous = temp;
            temp = next;
            count++;
        }
        if(next != null)
            head.setNext(reverseInGroup(next,k));

        return previous;
    }
    //printing list
    public void printList(Node node){
        System.out.println();
        while(node != null){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
    }
}
