package Easy;

public class Test69 {
    public static int mySqrt(int x) {
        double result = x/2.0;
        double threshold = 0.001;
        if (x <= 0)
            return 0;
        while (true) {
            double temp = (result + x/result)/2;
            if (Math.abs(result - temp) < threshold) {
                return (int) temp;
            }
            result = temp;
        }
    }

    public static void main(String[] args) {
        int result = Test69.mySqrt(0);
        System.out.println(result);
    }
}
