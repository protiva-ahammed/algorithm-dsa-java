import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {

    public static int[] prefixSumFind(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        //prefix
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Enter an integer array to find the product without it`s own value: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <  n; i++) {
            a[i]=(in.nextInt());
        }
        System.out.println(Arrays.toString(prefixSumFind(a)));
    }
}
