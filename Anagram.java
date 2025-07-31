import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        char [] ss= s.toCharArray();
        char [] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);
    }
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        String s ,t;
        s = in.next();
        t = in.next();
        System.out.println(isAnagram(s,t));

    }
}
