public class String_Compression {
    String compressBad(String str){
        String compressString = "";
        int contConsecutive = 0;
        for (int i = 0; i < str.length(); i++){
            contConsecutive++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressString += "" + str.charAt(i) + contConsecutive;
                contConsecutive = 0;
            }
        }
        return  compressString.length() < str.length() ? compressString : str;
    }
}


