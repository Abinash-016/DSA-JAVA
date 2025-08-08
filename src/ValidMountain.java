import java.util.*;

public class ValidMountain {
    public static void main(String[] args) {

        int[][] testCases = {
                {0, 3, 5, 4, 2},
                {2, 1},
                {3, 5, 5},
                {0, 2, 3, 4, 5, 2, 1, 0},
                {0, 2, 3, 3, 5, 2, 1}
        };

        Solution sol = new Solution();
        for (int[] test : testCases) {
            System.out.println(Arrays.toString(test) + " → " + sol.validMountainArray(test));
        }
    }
}

class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int l = 0, r = n - 1;

        while (l + 1 < n && arr[l] < arr[l + 1]) {
            l++;
        }

        while (r - 1 >= 0 && arr[r] < arr[r - 1]) {
            r--;
        }

        return l > 0 && r < n - 1 && l == r;
    }
}
