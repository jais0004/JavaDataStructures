import java.util.Arrays;
public class Anagrams {
    
    public boolean checkAnagram(String firstWord, String secondWord) {
     char[] word1 = firstWord.toCharArray();
     char[] word2 = secondWord.toCharArray();
     Arrays.sort(word1);
     Arrays.sort(word2);
     return Arrays.equals(word1, word2);
    }
    
    public static void main(String[] arg){
        Anagrams a = new Anagrams();
        
        System.out.println(a.checkAnagram("ABC", "AAD"));
    }
}