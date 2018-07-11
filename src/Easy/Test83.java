package Easy;

public class Test83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode post = pre.next;
        while (post != null) {
            if (pre.val == post.val) {
                pre.next = post.next;
                post = pre.next;
            } else {
                pre = post;
                post = post.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Test83 test = new Test83();

    }
}
