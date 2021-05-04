package JavaPractice.LinkedList;

public class Main {
    public static void main(String[] args) {
        Definition definition = new Definition();
        definition.insertAtTheBeg(20);
        definition.insertAtTheEnd(30);
        definition.insertAtTheBeg(10);
        definition.insertAtTheEnd(40);
        definition.printList();
        definition.deleteFirst();
        definition.printList();
        definition.deleteLast();
        definition.printList();
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
