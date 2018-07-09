package Easy;

public class Test58 {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.equals(""))
            return 0;
        String[] strs = s.split(" ");
        if (strs.length == 0)
            return 0;
        return strs[strs.length-1].toCharArray().length;
    }

    public static void main(String[] args) {
        int num = Test58.lengthOfLastWord("                   ");
        System.out.println(num);
    }
}
