public class Palindrome_Permutation2 {
    public static void main(String[] args) {
        boolean a = isPermutationOfPalindrome("Tact Coa");
        System.out.print(a);
    }
    private static boolean isPermutationOfPalindrome(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c = getCharNumber(c));
        if (x != -1){
            table[x]++;
            if (table[x] % 2 == 1){
                countOdd++;
            }else {
                countOdd--;
            }
        }
        return countOdd <= 1;
    }
}
