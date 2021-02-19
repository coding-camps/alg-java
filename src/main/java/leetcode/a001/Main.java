package leetcode.a001;

import java.util.Arrays;

public class Main {

    public int[] twoSum1(int[] nums, int target) {
        int[] result = { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] numsList =  {
                {2, 7, 11, 15},
                { 2, 3, 4, 5}
        };

        int target = 9;
        Main solution = new Main();
        for(int[] nums: numsList) {
            System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        }

    }
}
