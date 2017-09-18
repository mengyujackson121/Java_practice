/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    !! Only work with the lowercase "a" to "z", not work for the original problem
    Play with boolean, fast but confuse.
*/

public class is_Unique2 {
    public static void main(String[] args) {
        boolean a = isUniqueChars("5dABCaf");
        System.out.print(a);
}
    // Assume str only contains lowercase char between "a" to "z", max 26 char
   static boolean isUniqueChars (String str){
        // check the length
        if (str.length() > 26) return false;
        // set int instead boolean
        int checker = 0;
       // go through all input char
        for (int i = 0; i < str.length(); i++) {
            // Grab the i char from the input. get a int by minus 'a' ( b/c only for "a" to "z")
            int val = str.charAt(i) - 'a';
            /*
            if the checker is 0000
            and the val is 2 mean 0010
            1 & 0 == 0
            1 & 1 == 1
            0 & 1 == 0
             */
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            /*
            | is or
            = is equal
            1 | 0 == 1
            0 | 1 == 1
            0 | 0 == 0
            1 | 1 == 1
             */
            checker |= (1 << val);
        }
        return true;
    }
}

