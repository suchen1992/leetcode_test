package Medium;
// DP problem
// correct answer

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] results = new int[triangle.size()+1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> temp = triangle.get(i);
            for (int j = 0; j < temp.size(); j++) {
                results[j] = Math.min(results[j], results[j+1]) + temp.get(j);
            }
        }
        return results[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> ele1 = new ArrayList<>();
        ele1.add(-1);
        List<Integer> ele2 = new ArrayList<>();
        ele2.add(2);
        ele2.add(3);
        List<Integer> ele3 = new ArrayList<>();
        ele3.add(1);
        ele3.add(-1);
        ele3.add(-3);
        triangle.add(ele1);
        triangle.add(ele2);
        triangle.add(ele3);
        Test120 t = new Test120();
        int min = t.minimumTotal(triangle);
        System.out.println(min);
    }

//    List<Integer> ele1 = new ArrayList<>();
//        ele1.add(2);
//    List<Integer> ele2 = new ArrayList<>();
//        ele2.add(3);
//        ele2.add(4);
//    List<Integer> ele3 = new ArrayList<>();
//        ele3.add(6);
//        ele3.add(5);
//        ele3.add(7);
//    List<Integer> ele4 = new ArrayList<>();
//        ele4.add(4);
//        ele4.add(1);
//        ele4.add(8);
//        ele4.add(3);
//        triangle.add(ele1);
//        triangle.add(ele2);
//        triangle.add(ele3);
//        triangle.add(ele4);
//
}
