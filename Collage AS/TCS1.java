//Given a string s , the task is to encrypt the string in the following way: 

//   # if the frequency of current char is even , then increment current char by x 
//   # if the frequency of current char is odd , then decrement  current char by x 

//   Note:- All the operation are circular that is adding 1 to 'Z ' will give 'a' and substracting 

//   input: s= "abcda" , x = 3
//   Output : dyzad



import java.util.HashMap;
public class TCS1 {
    
    public static String encrypt(String s, int x) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        char[] chars = s.toCharArray();
        
        // Count frequency of each character

        for (char c : chars) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Encrypt the string
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int freq = freqMap.get(c);
            
            if (freq % 2 == 0) {
                chars[i] = shiftChar(c, x, true);
            } else {
                chars[i] = shiftChar(c, x, false);
            }
        }
        
        return new String(chars);
    }
    
    private static char shiftChar(char c, int x, boolean increment) {
        int base = Character.isUpperCase(c) ? 'A' : 'a';
        int offset = c - base;
        int newOffset;
        
        if (increment) {
            newOffset = (offset + x) % 26;
        } else {
            newOffset = (offset - x + 26) % 26;
        }
        
        return (char) (base + newOffset);
    }
    
    public static void main(String[] args) {
        String s = "abcda";
        int x = 3;
        System.out.println(encrypt(s, x));  
      
      
       
  }
    
  }

