import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class MaxWaterContainerTwoPointer {

    public static int MaxContainerAreaTwoPointer(int [] num){

        int res  = 0;
        int l = 0,r = num.length-1;
        while(l < r){

            res = Math.max(res, Math.min( num[l] , num[r])*(r-l));
            if(num[l]< num[r])
                l++;
            else
                r--;

        }
        return res;
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
        System.out.println(MaxContainerAreaTwoPointer(nums));
    }
}
