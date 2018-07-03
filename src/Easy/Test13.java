package Easy;

public class Test13 {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int i = 0;
        while (i < chars.length) {
            int temp = char2int(chars[i]);
            int tempNext = 0;
            if (i + 1 != chars.length)
                tempNext = char2int(chars[i+1]);
            if (temp == -1 || tempNext == -1) {
                return 0;
            }
            if (tempNext > temp && tempNext != 0) {
                sum = sum + (tempNext - temp);
                i += 2;
            }
            else {
                sum += temp;
                i += 1;
            }
        }
        return sum;
    }
    private static int char2int(char c) {
        switch (c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(Test13.romanToInt("MCMXCIV"));
    }
}
