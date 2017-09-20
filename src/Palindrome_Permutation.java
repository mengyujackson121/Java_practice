public class Palindrome_Permutation {
    public static void main(String[] args) {
        boolean a = isPermutationOfPalindrome("Tact Coa");
        System.out.print(a);
    }
    private static boolean chckMaxOneOdd(int[] table){
        boolean foundOdd = false;
        for(int count : table){
            if(foundOdd){
                return false;
            }
        }
        return true;
    }
    private static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }
    private static int[] buildCharFrequencyTable(String phrase){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c: phrase.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
            }
        }
        return table;
    }
    static boolean isPermutationOfPalindrome(String phrase){
        int[] table = buildCharFrequencyTable(phrase);
        return chckMaxOneOdd(table);
    }
}
