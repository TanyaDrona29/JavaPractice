package JavaPractice.LinkedList;

public class Main {
    public static void main(String[] args) {
        Definition definition = new Definition();
        definition.insertAtTheBeg(20);
        definition.insertAtTheEnd(30);
        definition.insertAtTheBeg(10);
        definition.insertAtTheEnd(40);
        System.out.println("printing the list");
        definition.printList(definition.head);
        definition.head = definition.reverse(definition.head);
        System.out.println();
        System.out.println("printing the reversed linked list");
        definition.printList(definition.head);
        System.out.println();
        definition.head = definition.reverseInGroup(definition.head,2);
        System.out.println("printing reversed list in group of given size");
        definition.printList(definition.head);
        definition.deleteFirst();
        System.out.println();
        definition.printList(definition.head);
        definition.deleteLast();
        System.out.println();
        definition.printList(definition.head);
        if(definition.searchElement(10)){
            System.out.println();
            System.out.println("element found");
        }
        else{
            System.out.println();
            System.out.println("element not found");
        }
  }
}
