package LinkedList;

public class Main {
    public static void main(String[] args){
       LinkedListEx ll=new LinkedListEx();
       ll.insertAtFirst(2);
        ll.insertAtFirst(1);
        ll.insertAtFirst(0);
        ll.insertAtFirst(6);
        ll.insertAtFirst(8);
        ll.insertAtLast(42);
        ll.insertAtMiddle(23,3);
        ll.displayLL();
        System.out.println("Deleted Node is:"+ll.deleteAtFirst());
        System.out.print("New Linked List is:");
        ll.displayLL();
        System.out.println("We deleted the last node of the list:"+ll.deleteAtLast());
        System.out.print("New Linked List is:");
        ll.displayLL();
        System.out.println("New Size of the Linked List is:"+ll.getsize());
        System.out.println("Node that to be deleted is: "+ll.deleteAtMiddle(3));
        System.out.print("New Linked List is:");
        ll.displayLL();
        System.out.println("The value of node with index 3 is:"+ll.findNodevalue(3));
        ll.displayLL();
    }
}
