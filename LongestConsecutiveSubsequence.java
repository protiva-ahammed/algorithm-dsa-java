import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSubsequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int n: nums){
            numSet.add(n);
        }
        int longest = 0;
        for(int n: numSet){
            if(!numSet.contains(n-1)) {
                int length = 0;
                while(numSet.contains(n + length)){
                    length++;
                }
                longest = Math.max(longest , length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the list total element : ");
        int n = in.nextInt();
        String s ;
        s = in.next();
        int [] nums  = new int[n];
        String[] st;

        s=s.replaceAll("\\[|\\]", "");
        st=s.split(",");
        nums= Arrays.stream(st)
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

//        for(int i=0;i<n;i++){
//            nums[i] = in.nextInt();
//        }
        System.out.println("longest consecutive subsequence: " +longestConsecutive(nums));
    }
}
