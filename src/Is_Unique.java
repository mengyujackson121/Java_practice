/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    1) If length bigger than 128, must have some duplicate ASCII, because ASCII only have 128 characters.
    2) boolean
*/

public class Is_Unique {
    public static void main(String[] args) {
        boolean a = is_UniqueChars("5daf");
        System.out.print(a);
    }
    // Create boolean function, only allowed return value by "true" or "false".
    static boolean is_UniqueChars(String str){
        //Check the length of the string, if is longer than 128 char, must have some duplicate. ASCII only 128 char.
        if (str.length() > 128) return false;
        // Create 128 long boolean array. if is smaller, can't check all ASCII char.
        boolean[] char_set = new boolean[128];
        // go through all input char
        for (int i = 0; i < str.length();i++){
        // int value for the char.
            int val = str.charAt(i);
        // check the boolean array in 'val' location is true(see it before), return false
            if (char_set[val]){
                return false;
            }
        // first time see the val, set boolean be true.
            char_set[val] = true;
        }
        //  if not false, return true.
        return true;
    }
}

