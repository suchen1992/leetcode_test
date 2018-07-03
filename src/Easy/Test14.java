package Easy;

public class Test14 {
    public static String longestCommonPrefix(String[] strs) {
        String commonString = "";
        if (strs.length == 0)
            return commonString;
        for (int i = 1; i <= strs[0].length(); i++) {
            commonString = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                System.out.println(strs[j].substring(0, i));
                if (strs[j].length() < i || !commonString.equals(strs[j].substring(0, i)))
                    return commonString.equals("") ? commonString : commonString.substring(0, commonString.length()-1);
                continue;
            }
        }
        return commonString;
    }

    public static void main(String[] args) {
        String[] strs = {"a"};
        String commonStr = Test14.longestCommonPrefix(strs);
        System.out.println(commonStr);
    }
}
