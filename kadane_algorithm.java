public class kadane_algorithm {

    static int KadanesAlgorithm(int [] a){

        int currSum=a[0];
        int maxSum=a[0];
        for(int i=0;i<a.length;i++){
            currSum=Math.max(a[i],currSum+a[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;

    }


    static int bruteForceKadaneAlgorithm(int[] a){

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int newSum=0;
            for(int j=i;j<a.length;j++){
                newSum+=a[j];
                if(newSum>maxSum){
                    maxSum=newSum;
                }

            }
        }

        return maxSum;
            
    }
    public static void main(String[] args) {

        int [] arr = {-2,5,7,-8,5};
        int res = KadanesAlgorithm(arr);
        int ans = bruteForceKadaneAlgorithm(arr);

        System.out.println(res + " ans " + ans);

        
    }
    
}
