// Problem1.java
public class Problem1 {

    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        ListNode first = l1;
        ListNode second = l2;


        if (l1 != null) {
       while (first.next != null) {
            first = first.next;
        }
        first.next = second;
        }



        // Handle the case where l1 is null (empty list)
        if (l1 == null) {
            // Create a new list by copying nodes from l2
            ListNode newHead = null;
            ListNode current = null;
            while (l2 != null) {
                if (newHead == null) {
                    newHead = new ListNode(l2.val);
                    current = newHead;
                } else {
                    current.next = new ListNode(l2.val);
                    current = current.next;
                }
                l2 = l2.next;
            }
            return newHead;
        }


        return l1;
    }


}

