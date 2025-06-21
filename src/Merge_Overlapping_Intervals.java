import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Merge_Overlapping_Intervals {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of intervals
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            arr[j][0] = sc.nextInt();
            arr[j][1] = sc.nextInt();
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {

    }
    }
