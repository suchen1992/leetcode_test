package Easy;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2;
        ListNode result = null, next = result;
        int sum = 0;
        while (t1 != null || t2 != null) {
            sum /= 10;
            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }
            if (result == null) {
                next = result = new ListNode(sum % 10);
            } else {
                next.next = new ListNode(sum % 10);
                next = next.next;
            }
        }
        if (sum / 10 > 0) {
            next.next = new ListNode(1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,4,5,9};
        int[] arr2 = {5,6,4};
        ListNode l1 = ListNode.construct(arr1);
        ListNode l2 = ListNode.construct(arr2);
        addTwoNumbers(l1, l2);
    }
}
