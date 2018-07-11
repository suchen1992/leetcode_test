package Easy;
// correct answer

public class Test88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < result.length; i++) result[i] = nums1[i];
        for (int i = 0, j = 0, k = 0; i < m+n; i++) {
            if (j >= m) nums1[i] = nums2[k++];
            else if (k >= n) nums1[i] = result[j++];
            else if (result[j] <= nums2[k]) nums1[i] = result[j++];
            else nums1[i] = nums2[k++];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
        int[] nums2 = {1,2,2};
        Test88 test88 = new Test88();
        test88.merge(nums1, 6, nums2, 3);
        System.out.println(nums1);
    }

//    void merge(int A[], int m, int B[], int n) {
//        int i=m-1;
//        int j=n-1;
//        int k = m+n-1;
//        while(i >=0 && j>=0)
//        {
//            if(A[i] > B[j])
//                A[k--] = A[i--];
//            else
//                A[k--] = B[j--];
//        }
//        while(j>=0)
//            A[k--] = B[j--];
//    }
}
