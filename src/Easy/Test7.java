package Easy;

public class Test7 {
    public static int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
//                return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
//                return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
        String str = x + "";
        int result = 0;
        str = new StringBuilder(str).reverse().toString();
        if (str.indexOf("-") == str.length()-1) {
            String temp = "-";
            temp += str.substring(0, str.length()-1);
            str = temp;
        }
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = Test7.reverse(1534236469);
        System.out.print(result);
    }
}