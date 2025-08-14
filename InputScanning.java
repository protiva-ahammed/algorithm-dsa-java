import java.util.Arrays;
import java.util.Scanner;

public class InputScanning {

    public int [] TakeInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the list total element in ascending order : ");
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

        return nums;

    }



}
