class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode node = head;

        while (node != null) {
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }
}