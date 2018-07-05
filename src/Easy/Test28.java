package Easy;

public class Test28 {
    // correct answer
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int prev = i, j = 0;
            if (i + needle.length() >= haystack.length())
                return -1;
            while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++; j++;
            }
            if (j == needle.length())
                return prev;
            i = prev;
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = Test28.strStr("mississippi", "issip");
        System.out.println(result);
    }
}
