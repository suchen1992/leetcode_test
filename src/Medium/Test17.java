package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test17 {
    private static final String[] num2Str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<StringBuilder> tempList = new LinkedList<>();
        List<String> results = new LinkedList<>();
        if (digits == null || digits.length() <= 0)
            return results;
        int num = (int)digits.charAt(0) - '0';
        for (int j = 0; j < num2Str[num-2].length(); j++) {
            StringBuilder temp = new StringBuilder();
            temp.append(num2Str[num-2].charAt(j));
            tempList.add(temp);
            if (digits.length()-1 == 0)
                results.add(temp.toString());
        }
        for (int i = 1; i < digits.length(); i++) {
            num = Character.getNumericValue(digits.charAt(i));
            int k = tempList.size();
            for (int l = 0; l < k; l++) {
                StringBuilder temp = tempList.remove(0);
                for (char j : num2Str[num-2].toCharArray()) {
                    StringBuilder tSB = new StringBuilder(temp);
                    tSB.append(j);
                    tempList.add(tSB);
                    if (i == digits.length()-1)
                        results.add(tSB.toString());
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Test17 t = new Test17();
        String digits = "2";
        List<String> temp = t.letterCombinations(digits);
        System.out.println(temp);
    }
}
