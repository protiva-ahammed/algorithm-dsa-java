import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashingPreComputation {

    static final long M = 10000000007L;

    public static long factorUsingBruteForce(int n){
        long fact =1;
        for(int i = 2;i<=n;i++){
            fact = (fact * i) % M;
        }
        return fact;
    }

    public static Long HashingPreComputation(int n){

        List<Long> factor = new ArrayList<>();
        factor.add(0,1L);
        factor.add(1,1L);

//        pre computer the value of factor
        for(int i=2;i<=100;i++){
            factor.add(i, (factor.get(i - 1) * i) % M);
        }
        return (factor.get(n - 1) *n)%M;
    }

    public static void main(String[] args) {

        // find the factor of number
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorUsingBruteForce(n));
        System.out.println(HashingPreComputation(n));

    }
}
