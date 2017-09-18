/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    1) If length bigger than 128, must have some duplicate ASCII, because ASCII only have 128 characters.
    2) Read the string, first char then compare with the rest.
    3) O(n2)
    4) Easy to read
  */
public class is_unique3
{
    public static void main(String[] args) {
        System.out.println(is_UniqueChars("5daf+-"));
        System.out.println(is_UniqueChars("55daf+-"));
        System.out.println(is_UniqueChars("5ddaf+-"));


    }
    static boolean is_UniqueChars(String str){
        if (str.length() > 128) return false;
        for(int i = 0; i < str.length() - 1; i++){
            int vali = str.charAt(i);
            for (int j = i+1; j < str.length(); j++){
                int valj = str.charAt(j);
                if (vali == valj)
                    return false;
            }
        }
    return true;
    }
}
