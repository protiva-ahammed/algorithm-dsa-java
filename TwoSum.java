import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0 ;i <n;i++){
            for(int j = i+1;j< n;j++)
                if((target-numbers[i]) == numbers[j])
                    return new int[]{i+1,j+1};
        }
        return new int[]{1,2};
    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4};
        System.out.println(Arrays.toString(twoSum(arr , 6)));
    }
}
