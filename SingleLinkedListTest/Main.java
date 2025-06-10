// Removed package declaration to match the expected package structure

public class Main {
    public static void main(String[] args) {
        SingleLinkedListTest sll = new SingleLinkedListTest();

        // Create the initial linked list with one node
        sll.createSingleLinkedlist(10);

        // Insert more nodes
        sll.insertLinkedList(20, 1);
        sll.insertLinkedList(30, 2);
        sll.insertLinkedList(40, 3);

        System.out.println("Original List:");
        sll.traverseLinkedList();

        // Delete the first node (index 0)
        sll.delete(0);
        System.out.println("After deleting index 0:");
        sll.traverseLinkedList();

        // Delete the last node (now at index 2)
        sll.delete(2);
        System.out.println("After deleting last index:");
        sll.traverseLinkedList();

        // Attempt to delete from an invalid index
        sll.delete(5); // Should print error
    }
}




