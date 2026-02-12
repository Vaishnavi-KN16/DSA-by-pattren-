// delete end 
class Node {
    int data;
    Node next;
    
    Node(int data1)
    {
        data=data1;

    }
}
class Operations{

    public void delete_end(Node head)
    {
        Node cur=head ;
        while( cur.next.next!=null)// the memory of the last is  not set to free here and this will crash when list is empty and has onbe node 
        {
            cur=cur.next;

        }
        cur.next=null;

    }
    public void printlist( Node head)
    {
        Node cur=head;
        while( cur!=null)
        {
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
    }

}

public class delete_end {
    public static void main(String[] args) {
        Node head= new Node ( 1);
        head.next= new Node(2);
        head.next.next= new  Node(3 );

        Operations b = new Operations();
        System.out.println(" before deletion ");
        b.printlist(head);
        System.out.println(" after deletion ");
        b.delete_end(head);
        b.printlist(head);



    }
    
}
