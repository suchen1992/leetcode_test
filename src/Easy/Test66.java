package Easy;
// correct answer

public class Test66 {
    public static int[] plusOne(int[] digits) {
        int[] results = new int[digits.length+1];
        digits[digits.length-1] = digits[digits.length-1]+1;
        if (digits[digits.length - 1] < 10)
            return digits;
        boolean upFlag = false;
        for (int i = digits.length-1; i >= 0; i--) {
            if (upFlag)
                digits[i] += 1;
            if (digits[i] == 10) {
                results[i + 1] = digits[i] % 10;
                digits[i] %= 10;
                upFlag = true;
            } else {
                results[i + 1] = digits[i];
                upFlag = false;
            }
        }
        if (digits[0] != 0)
            return digits;
        results[0] = 1;
        return results;
    }

    public static void main(String[] args) {
        int[] digits = {9,9};
        int[] result = Test66.plusOne(digits);
        System.out.println(result);
    }
}
//    public int[] plusOne(int[] digits) {
//
//        int n = digits.length;
//        for(int i=n-1; i>=0; i--) {
//            if(digits[i] < 9) {
//                digits[i]++;
//                return digits;
//            }
//
//            digits[i] = 0;
//        }
//
//        int[] newNumber = new int [n+1];
//        newNumber[0] = 1;
//
//        return newNumber;
//    }