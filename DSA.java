import LinkedListutil.*;
public class DSA 
{
    public static void main(String[] args) 
    {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        head.next =n1;
        n1.next = n2;
        Util u = new Util();
        u.print(head);
        int len = u.length(head);
        System.out.println("Length of the SinglyLinkedList is : " +len);
        head=u.insertAt(head, len, 40);
        System.out.println("After Insertion LL");
        u.print(head);
        len =u.length(head);
        head = u.remove(head, len-1);
        System.out.println("After removing : ");
        u.print(head);
        
                
        
    }
}
