// Removed package declaration to match the expected package structure

public class SingleLinkedListTest {
    private Node head;
    private Node tail;
    public int size;

    // Node class
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Create a single linked list with one node
    public void createSingleLinkedlist(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
    }

    // Insert a node at a given position
    public void insertLinkedList(int value, int location) {
        Node node = new Node(value);

        if (head == null) {
            createSingleLinkedlist(value);
            return;
        }

        if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }

        size++;
    }

    // Traverse and print the list
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist");
            return;
        }

        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i < size - 1) System.out.print("->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    // Search for a node by value
    public boolean searchNode(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return false;
        }

        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == value) {
                System.out.println("Found the node at location: " + i);
                return true;
            }
            tempNode = tempNode.next;
        }

        System.out.println("Node not found.");
        return false;
    }

    // Delete a node at a given position
    public void delete(int position) {
        if (head == null) {
            System.out.println("List does not exist.");
            return;
        }

        if (position < 0 || position >= size) {
            System.out.println("Error: Position out of bounds.");
            return;
        }

        if (position == 0) {
            head = head.next;
            size--;
            if (size == 0) tail = null;
            return;
        }

        Node tempNode = head;
        for (int i = 0; i < position - 1; i++) {
            tempNode = tempNode.next;
        }

        tempNode.next = tempNode.next.next;

        if (position == size - 1) {
            tail = tempNode;
        }

        size--;
    }
}

