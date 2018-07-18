package Medium;
// DP problem

public class Test5 {
    public String longestPalindrome(String s) {
        StringBuilder longest = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp;
            StringBuilder temp2;
            temp = palindromic(s, i-1, i+1);
            temp2 = palindromic(s, i, i+1);
            temp = temp.length() > temp2.length()? temp :temp2;
            longest = longest.length() < temp.length() ? temp : longest;
        }
        return longest.toString();
    }

    static StringBuilder palindromic(String s, int pre, int post) {
        if (pre < 0 || post > s.length()) return new StringBuilder(s.substring(pre+1, post));
        StringBuilder temp = new StringBuilder(s.substring(pre+1, post));
        for (; pre >= 0 && post < s.length(); pre--, post++) {
            if (s.charAt(pre) != s.charAt(post)) return temp;
            else temp = new StringBuilder(s.substring(pre, post + 1));
        }
        return temp;
    }

    public static void main(String[] args) {
        String s = "babad";
        Test5 temp = new Test5();
        String longest = temp.longestPalindrome(s);
        System.out.println(longest);
    }
}
