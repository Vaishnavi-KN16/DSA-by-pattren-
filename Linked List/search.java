import java.util.Scanner;


class Node {
    int data;
    Node next;

    Node( int data1)
    {
        data=data1;
        next=null;w

    }
}
class Operations{
    public void search(Node head, int key )
    {
        Node temp=head;
        while( temp!=null)
        { 
            if( temp.data==key)
            {
                System.out.println(" The element is present ");
                return;
            }
                temp=temp.next;

            
        }
        System.out.println(" the element is not present");


        
    }

}


public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        Node head= new Node (1);
        head.next=new Node (2);
        head.next.next=new Node ( 3);
        Operations d = new Operations();
        System.out.println(" enter key to search ");
        int key = sc.nextInt();

        d.search(head, key );
        sc.close();

    }
    
}
