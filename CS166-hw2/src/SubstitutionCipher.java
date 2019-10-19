import java.util.HashMap;
import java.util.Map;

public class SubstitutionCipher {
    public static void main(String[] args){
        // Part of plaintext that I used to test from Lecture 1 - slides.
        String plaintext = "PBFPVYFBQXZTYFPBFEFSJDKFLWENRWEKLJFSIODUFJKLWEJRKLFNKLJSKLDFJLKE";
        // The key values with randomly substitute for plaintext.
        String key = "HMYEJDQIZNUKXCLVTSWAPBRFOG";

            String ciphertext = encryption(plaintext,key);
            System.out.println("The Plaintext is: " + plaintext);
            System.out.println("The Ciphertext is: " + ciphertext);


         // Frequency Analysis
        String str = ciphertext;
        Map<Character,Integer> charCount = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch) +1);
            }else{
                charCount.put(ch,1);
            }
        }
        System.out.println(charCount);
        }

     public static String encryption(String str, String key) {
            char[] ptext = str.toCharArray();
            for (int i = 0; i < ptext.length; i++)
                ptext[i] = key.charAt(ptext[i] - 'A');
            return new String(ptext);
        }
}
