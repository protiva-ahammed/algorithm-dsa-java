import java.util.Scanner;

public class Palindromes {

    // build in string stl , reversing
    public static boolean isPalindromeReversing(String s){
        String st = s.toLowerCase();
        s = st.replaceAll("[^a-zA-Z0-9]", "");
        st = new StringBuilder( s).reverse().toString();
        return s.equals(st);
    }


    // two pointer
    //an algorithmic pattern that uses two pointers (indices)
    // to traverse a data structure, typically an array or linked list,
    //in a controlled manner.
    // This technique is particularly effective for problems involving sorted data
    // or those requiring the comparison or manipulation of elements
    // from different parts of a sequence.

    //algorithm
   //increase left decrease right to see if they are same. if so it will be palindrome

    public static boolean isPalindromeTwoPointer(String s){

        int l=0, r =s.length()-1;

        while(l < r){
            while(l < r && !isAlphaNum(s.charAt(l))){
                l++;
            }
            while((r > l) && !isAlphaNum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public static boolean isAlphaNum(char c){
        boolean b = (c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9');
        return b;
    }


    public static void main(String[] args) {
        String s ;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        System.out.println(isPalindromeReversing(s));
        System.out.println(isPalindromeTwoPointer(s));

    }
}
