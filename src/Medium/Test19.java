package Medium;

import Easy.ListNode;

public class Test19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode post = start;
        for (ListNode pre = start; pre.next!=null; pre = pre.next) {
            if (count >= n) post = post.next;
            count++;
        }
        post.next = post.next.next;
        return start.next;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        ListNode head = ListNode.construct(nums);
        Test19 t = new Test19();
        ListNode result = t.removeNthFromEnd(head, 1);
        System.out.println(result);
    }
}
