// finding the length of a loop in SLL
// using Floyd's algorithm

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Operations {

    // Counts length of loop once meeting point is known
    public int countloop(Node meetingpoint) {
        Node temp = meetingpoint;
        int length = 1;

        while (temp.next != meetingpoint) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    // Detects loop and returns its length
    public int detect_loop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return countloop(slow); // meeting point
            }
        }
        return 0; // no loop
    }
}

public class length_of_loop {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating loop: 4 → 2
        head.next.next.next.next = head.next;

        Operations op = new Operations();
        int looplength = op.detect_loop(head);

        if (looplength > 0) {
            System.out.println("Length of loop is " + looplength);
        } else {
            System.out.println("No loop found");
        }
    }
}
