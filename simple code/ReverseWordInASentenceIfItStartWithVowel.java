package practice;
// not done yet
public class ReverseWordInASentenceIfItStartWithVowel {
		 
		//check for vowel
		    static boolean test(char ch) {
		        return (ch == 'a' || ch == 'A' || ch == 'e'
		                || ch == 'E' || ch == 'i' || ch == 'I'
		                || ch == 'o' || ch == 'O' || ch == 'u'
		                || ch == 'U');
		    }
		 
		//  reverse order of vowels
		    static String reverse(String str1) {
		        int j = 0;
		        // Storing the vowels separately
		        char[] str = str1.toCharArray();
		        String vowel = "";
		        for (int i = 0; i < str.length; i++) {
		            if (test(str[i])) {
		                j++;
		                vowel += str[i];
		            }
		        }
		 
		        // Placing the vowels in the reverse
		        // order in the string
		        for (int i = 0; i < str.length; i++) {
		            if (test(str[i])) {
		                str[i] = vowel.charAt(--j);
		            }
		        }
		 
		        return String.valueOf(str);
		    }
		 
		// main function
		    public static void main(String[] args) {
		        String str = "";
		        System.out.println(reverse(str));
		    }
		}
		 
		

