package recursion;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static int sumIteratively(List<Integer> nums) {
        int sum = 0;
        for (int num: nums) {
            sum = sum + num;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);

        System.out.println(sumIteratively(nums));
        sumRecursively(nums);

    }
    public static int sumRecursively(List<Integer> nums) {
        return sumRecursivelyInner(nums, 0);
    }
    public static int sumRecursivelyInner(List<Integer> nums, int index) {
        if (nums.size() == index) {
            return 0;
        }
        return nums.get(index) + sumRecursivelyInner(nums, index + 1);
    }
}
