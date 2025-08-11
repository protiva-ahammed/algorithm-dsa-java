import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static int[] twoSumBruteForce(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0 ;i <n;i++){
            for(int j = i+1;j< n;j++)
                if((target-numbers[i]) == numbers[j])
                    return new int[]{i+1,j+1};
        }
        return new int[]{1,2};
    }

    public static int[] twoSumTwoPointer(int[] numbers, int target) {
        int end = numbers.length -1;
        int first = 0;
        while (first<end){
            if((numbers[first]+ numbers[end]) >target)
                end -=1;
            else if(numbers[first]+ numbers[end]<target)
                first +=1;
            else
                return new int[]{first +1,end +1};
        }
        return new int[]{1,2};
    }

    public static List<List<Integer>> threeSumTwoPointer(int[] nums){
        List<List<Integer>> res = new ArrayList<>();

        for(int i= 0;i<nums.length;i++){
            if( i>0 && nums[i]  == nums[i-1])
                continue;
            int l = i+1,r=nums.length-1;
            while(l<r){
                int threeSum = nums[i] + nums[l]+nums[r];
                if(threeSum>0){
                    r--;
                }else if(threeSum<0){
                    l++;
                }else{
                    res.add(Arrays.asList(nums[i] , nums[l],nums[r]));
                    l++;r--;
                    while(l<r && nums[l]==nums[l-1])  l++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,-3,2,1};
        System.out.println(Arrays.toString(twoSumTwoPointer(arr , 6)));
        System.out.println(Arrays.toString(twoSumBruteForce(arr , 6)));
        System.out.println((threeSumTwoPointer(arr)));

    }
}
