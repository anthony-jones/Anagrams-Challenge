public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length() != b.length()){ return false;}
        
        int[] freqArray = new int[26];
        
        for ( int i = 0; i < a.length(); i++){
            char current = a.charAt(i);
            int freqIndex = current - 'a';
            freqArray[freqIndex]++;
        }
        
        for (int j = 0; j < b.length(); j++){
            char current = b.charAt(j);
            int freqIndex = current - 'a';
            freqArray[freqIndex]--;
        }
        
        for ( int k = 0; k < 26; k++){
            if(freqArray[k] != 0){
                return false;
            }
        }
        return true;
    }
