package nowcoder.sword_offer;
// correct answer

import java.util.*;

public class JumpFloor {
    public int JumpFloor(int target) {
        if (target == 1 || target == 2)
            return target;
        int result = 0;
        int j1 = 1;
        int j2 = 2;
        for (int i = 3; i <= target; i++) {
            int temp = j1 + j2;
            j1 = j2;
            j2 = temp;
        }
        return j2;
    }

    public static void main(String[] args) {
        JumpFloor jf = new JumpFloor();
        System.out.println(jf.JumpFloor(4));
    }
}
