class Solution {
    ListNode newHead = null;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return newHead;
    }
    private ListNode helper(ListNode head) {
        if (head == null || head.next == null) {
            newHead = head;
            return head;
        }
        ListNode tmp = helper(head.next);
        tmp.next = head;
        head.next = null;
        return head;
    }
}
