package LinkedList;

public class LinkedListEx {
    Node head;
    Node tail;
    int size;

private class Node{
    int data;
    Node next;
    public Node(int data){
    this.data=data;
    this.next=null;
    }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public void insertAtFirst(int val){
    Node node=new Node(val);
    node.next=head;
    head=node;
    if(tail==null){
        tail=head;
    }
    size++;
}
public void insertAtLast(int val){
    if (tail == null) {
        insertAtFirst(val);
        return;
    }
    Node node=new Node(val);
    tail.next=node;
    tail=node;
    size++;
}
public void insertAtMiddle(int val,int index){
    if(index==0){
        insertAtFirst(val);
    }
    else if(index==size){
        insertAtLast(val);
    }
    Node temp=head;
    for(int i=1;i<index;i++){
        temp=temp.next;
    }
    Node node=new Node(val,temp.next);
    temp.next=node;
    size++;
}
public int getsize(){
    return size;
}
public int deleteAtFirst(){
    int val=head.data;
    head=head.next;
    if(head==null){
        tail=null;
    }
    size--;
    return val;
}
public int deleteAtLast(){
    if(size<=1){
        deleteAtFirst();
    }
    Node secondlast=retNode(size-2);
    int val=tail.data;
    tail=secondlast;
    tail.next=null;
    size--;
    return val;
}
public Node retNode(int index){
    Node node=head;
    for(int i=0;i<index;i++){
        node=node.next;
    }
    return node;
}
public int deleteAtMiddle(int index){
    if(index==0){
        deleteAtFirst();
    }
    else if(index==size-1){
        deleteAtLast();
    }
    Node prevnode=retNode(index-1);
    int value=prevnode.next.data;
    prevnode.next=prevnode.next.next;
    size--;
    return value;
}
public int findNodevalue(int index){
    if(index==0){
        return head.data;
    }
    else if(index==size-1){
        return tail.data;
    }
    Node node=head;
    for(int i=1;i<=index;i++){
        node=node.next;
    }
    return node.data;
}
public void displayLL(){
    Node current=head;
    while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
    }
    System.out.println("End");
}
    public static void main(String[] args){
         LinkedListEx ll=new LinkedListEx();
         ll.insertAtFirst(2);
         ll.insertAtLast(1);
         ll.insertAtLast(0);
         ll.insertAtLast(6);
         ll.insertAtLast(8);
         ll.insertAtLast(4);
         ll.insertAtLast(6);
         ll.displayLL();
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
