package LINKEDLIST;

public class ReverseALinkedList {

    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Reverse the linked list iteratively
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;     // Store next node
            current.next = prev;     // Reverse current node's pointer
            prev = current;          // Move prev to current
            current = next;          // Move to next node
        }

        head = prev; // Reset head to new front of the list
    }

    // Main method to demonstrate the linked list reversal
    public static void main(String[] args) {
        ReverseALinkedList list = new ReverseALinkedList();

        // Adding elements to the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Original List: ");
        list.printList();

        list.reverse();

        System.out.print("Reversed List: ");
        list.printList();
    }
}
