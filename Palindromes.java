import java.util.Scanner;

public class Palindromes {

    // build in string stl , reversing
    public static boolean isPalindromeReversing(String s){
        String st = s.toLowerCase();
        String s1 = st.replaceAll("[^a-zA-Z0-9]", "");
        String riv = new StringBuilder( s1).reverse().toString();
        System.out.println(riv);
        return s1.equals(riv);
    }


    // two pointer
    public static boolean isPalindromeTwoPointer(String s){
        return false;
    }


    public static void main(String[] args) {
        String s ;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        System.out.println(isPalindromeReversing(s));
        System.out.println(isPalindromeTwoPointer(s));

    }
}
