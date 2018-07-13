package Medium;

public class Test6 {
    public String convert(String s, int numRows) {
        if (s == null || s.length()<=1 || numRows == 1)
            return s == null?"":s;
        int numLines = (int) Math.ceil(s.length()/(float) numRows);
        numLines = numLines + (numLines - 1) * numRows;
        char[][] chars = new char[numRows][numLines];
        StringBuilder result = new StringBuilder("");
        char[] s2chars = s.toCharArray();
        int index = 0;
        for (int j = 0; j < numLines && index < s2chars.length; j++) {
            for (int i = 0; i < numRows && index < s2chars.length; i++) {
                if (j % (numRows-1) == 0)
                    chars[i][j] = s2chars[index++];
                else {
                    if (j % (numRows-1) + i == numRows-1)
                        chars[i][j] = s2chars[index++];
                    else
                        chars[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numLines; j++) {
                if (chars[i][j] == ' ' || chars[i][j] == '\u0000')
                    continue;
                result.append(chars[i][j]);
            }
        }
        return result.toString();
    }
}
