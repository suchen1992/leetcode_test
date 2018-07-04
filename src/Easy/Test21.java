package Easy;

public class Test21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        ListNode mergeList = null;
        ListNode cur = null;
        while (l1 != null && l2 != null) {
            int val;
            if (l1.val < l2.val) {
                val = l1.val;
                l1 = l1.next;
            } else {
                val = l2.val;
                l2 = l2.next;
            }
            if (mergeList == null) {
                mergeList = new ListNode(val);
                cur = mergeList;
            } else {
                ListNode next = new ListNode(val);
                cur.next = next;
                cur = cur.next;
            }
        }
        if (l1 == null) {
            if (mergeList == null) return l2;
            cur.next = l2;
        }
        if (l2 == null) {
            if (mergeList == null) return l1;
            cur.next = l1;
        }
        return mergeList;
    }

    public static void main(String[] args) {
        Test21 temp = new Test21();
        int[] a = {};
        ListNode l1 = create(a);
        int[] b = {0};
        ListNode l2 = create(b);
        ListNode l3 = temp.mergeTwoLists(l1, l2);
        System.out.print(l3);
    }

    static ListNode create(int[] nos) {
        if (nos.length == 0)
            return null;
        ListNode l1 = new ListNode(nos[0]);
        ListNode cur = l1;
        for (int i = 1; i < nos.length; i++) {
            cur.next = new ListNode(nos[i]);
            cur = cur.next;
        }
        return l1;
    }
}
