package Easy;
// Test21 create list
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode construct(int[] nums) {
        ListNode l = new ListNode(nums[0]);
        ListNode p = l;
        for (int i = 1; i < nums.length; i++) {
            p.next = new ListNode(nums[i]);
            p = p.next;
        }
        return l;
    }
}
