public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);

        // Handle insertion at the beginning
        if (position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentPosition = 1;

        // Traverse the list to find the insertion point
        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
