package JavaPractice.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Definition definition = new Definition();
        definition.insertAtBeg(40);
        definition.insertAtBeg(30);
        definition.insertAtBeg(20);
        definition.insertAtBeg(10);
        definition.printList();
        definition.insertAtEnd(1);
        definition.insertAtEnd(2);
        definition.insertAtEnd(3);
        definition.printList();
        definition.deleteFirst();
        definition.printList();
    }
}
