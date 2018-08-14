package Medium;

import Easy.ListNode;

public class Test24 {
    public ListNode swapPairs(ListNode head) {
        int i = 0;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        ListNode post = pre.next;
        while (pre.next != null && post.next != null) {
            if (i % 2 == 0) {
                ListNode temp = post.next;
                post.next = post.next.next;
                temp.next = post;
                pre.next = temp;
            }
            pre = post;
            post = post.next;
            i+=2;
        }
        return start.next;
    }

    public static void main(String[] args) {
        int[] list = {1};
        ListNode head = ListNode.construct(list);
        Test24 t = new Test24();
        head = t.swapPairs(head);
        System.out.println(head);
    }
}
