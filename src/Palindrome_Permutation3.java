public class Palindrome_Permutation3
{
    public static void main(String[] args) {

    }
    private static boolean isPermutationOfPalindrome(String phrase){
        int bitVector = createBitVector(Phrase){
            int bitVector = 0;
            for (char c : phrase.toCharArray()){
                int x = getCharNumber(c);
                bitVector = toggle(bitVector, x);
            }
            return bitVector;
        }

        static int toggle(int bitVector, int index){
            if(index < 0) return bitVector;
            int mask = 1 << index;
            if((bitVector & mask) == 0){
                bitVector |= mask;
            }else{
                bitVector&= ~mask;
                }
            return bitVector;
            }
        boolean checkExactlyOneBitSet(int bitVector){
            return (bitVector & (bitVector - 1)) == 0;
            }
    }

}
