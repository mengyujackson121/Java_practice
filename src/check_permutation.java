/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */

public class check_permutation {
    public static void main(String[] args) {
        boolean a = permutation("abba","aabb");
        System.out.print(a);

    }
    static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    static boolean permutation(String s, String t){
        if (s.length() != t.length()){
            return false;
            }
    return sort(s).equals(sort(t));
    }
}
