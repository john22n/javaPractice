package PraticeQuestions;

import sun.awt.image.ImageWatched;

/**
 * Created by JohnNoriega22 on 10/8/17.
 */
public class LinkedListNode {
    public String value;
    public LinkedListNode next;

    public LinkedListNode(String value) {
        this.value = value;
    }

    public static void delete(LinkedListNode nodeToDelete) {
        LinkedListNode nextNode = nodeToDelete.next;

        if (nextNode != null) {
            //replace the input node's value and pointer with the next node's value and pointer the previous node now effectivley skips over the input node
            nodeToDelete.value = nextNode.value;
            nodeToDelete.next = nextNode.next;
        } else {
            throw new IllegalArgumentException("cant delete last node");
        }

    }



    // checks if Linked list contains a cycle
    public static boolean containsCycle(LinkedListNode firstNode) {
        LinkedListNode slowRunner = firstNode;
        LinkedListNode fastRunner = firstNode;

        // until we hit the end
        while(fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
            if (fastRunner == slowRunner) {
                return true;
            }
        }
        // case: fast runner hit the end of the list
        return false;
    }// complexity time: o(n) space: o (1)

    //a function that reverses a linnked list

    public static LinkedListNode reverse(LinkedListNode headOfNode) {
        LinkedListNode current = headOfNode;
        LinkedListNode previous = null;
        LinkedListNode nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;

            previous = current;
            current = nextNode;
        }
        return previous;
    }

    // find the kth to the last node takes the head and the integer
    // using a stick the size of the k we can find the node in one pass

    public static LinkedListNode kthToLastNode(int k , LinkedListNode head) {
        if (k < 1) {
            throw new IllegalArgumentException("impossible to check ");
        }
        LinkedListNode leftNode = head;
        LinkedListNode rightNode = head;

        for (int i =0; i <k -1; i++) {
            if (rightNode.next == null) {
                throw new IllegalArgumentException("k is larget than the length");
            }
            rightNode = rightNode.next;

        }

        while (rightNode.next != null) {
            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }

        return leftNode;
    }// time: o(n) space o(1)

    // creating a linkedlist
    class Node {
        Node next = null;
        int data;
        public Node(int d){
            data = d;
        }
        void appendToTail(int d) {
            Node end = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }
}
