import java.util.Arrays;

public class BinarySearch {

    public static int BinarySearching(int[] numbs , int target){

        int left = 0 , right = numbs.length - 1;

        // sorting
        Arrays.sort(numbs);

        while( left <= right ){

            int mid = (right-left)/2 + left;

            if( numbs [mid] > target ){
                right = mid -1;
            }else if (numbs[mid] < target ){
                left = mid + 1;
            }else if (numbs [mid] == target){
                return mid ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        InputScanning inputScanning = new InputScanning();
        System.out.println(BinarySearching(inputScanning.TakeInput(),5));
    }
}
