package datastructure;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked list !!!!");
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(56);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(70);
        linkedList.display();
        linkedList.getSize();
        linkedList.deleteElement(40);
        linkedList.display();
        linkedList.getSize();

    }
}