/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    1) If length bigger than 128, must have some duplicate ASCII, because ASCII only have 128 characters.
    2) Class to count the number of the char.
    3) O(n2)
    4) Easy to read
  */
public class is_Unique4
{
    public static void main(String[] args) {
        System.out.println(is_UniqueChars("5daf+-"));
        System.out.println(is_UniqueChars("55daf+-"));
        System.out.println(is_UniqueChars("5ddaf+-"));
    }
    static boolean is_UniqueChars(String str) {
        if (str.length() > 128) return false;
        for (int i = 0; i < str.length() - 1; i++) {
            char chr = str.charAt(i);
            if (count(str, chr) > 1)
                return false;
           }
        return true;
    }
    static int count(String str, char chr){
        int count = 0;
        for (int i = 0; i < str.length()-1;i++){
            if(chr == str.charAt(i))
                count = count + 1;
        }
        return count;
    }
}
