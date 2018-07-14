package Medium;

public class Test8 {
    public int myAtoi(String str) {
        if (str == null || str.length() <= 0) return 0;
        int symbol = 1;
        int index = 0;
        int result = 0;
        while (index < str.length()) {
            if (str.charAt(index) == ' ') index++;
            else if (str.charAt(index) == '-' || str.charAt(index) == '+') {
                symbol = str.charAt(index) == '-'?-1:1;
                index++;
                break;
            } else break;
        }
        while (index < str.length()) {
            if (str.charAt(index) < '0' || str.charAt(index) > '9') break;
            if (symbol == 1) {
                if (result < Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && str.charAt(index) - '0' < Integer.MAX_VALUE%10))
                    result = result * 10 + str.charAt(index++) - '0';
                else return Integer.MAX_VALUE;
            } else {
                result = result>0?result*-1:result;
                if (result > Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && (str.charAt(index) - '0')*symbol > Integer.MIN_VALUE%10))
                    result = result * 10 + (str.charAt(index++) - '0')*symbol;
                else return Integer.MIN_VALUE;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(-214748364%10);
        int result = t.myAtoi("   12 32");
        System.out.println(result);
    }
}
