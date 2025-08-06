package start.build.string;

public class ComplexStringOperations {

    public static void main(String[] args) {
        String input = "Ashutosh Shelke is a Software Engineer";

        System.out.println("Original String: " + input);

        System.out.println("1. String after removing duplicates: " + removeDuplicates(input));
        System.out.println("2. Reversed String: " + reverseString(input));
        countVowelsAndConsonants(input);
        System.out.println("3. Longest Word: " + findLongestWord(input));
        System.out.println("4. Is Palindrome: " + isPalindrome("madam")); 
        System.out.println("5. Word Count: " + countWords(input));
        System.out.println("6. Case Changed: " + changeCase(input));
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += ch;
            }
        }
        return result;
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("3. Vowels: " + vowels + ", Consonants: " + consonants);
    }


    public static String findLongestWord(String str) {
        String longest = "";
        String current = "";
        for (int i = 0; i <= str.length(); i++) {
            char ch = (i == str.length()) ? ' ' : str.charAt(i);
            if (ch != ' ') {
                current += ch;
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        return longest;
    }

  
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

   
    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        return count;
    }

    public static String changeCase(String str) {
        String changed = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                changed += (char) (ch + 32); 
            } else if (ch >= 'a' && ch <= 'z') {
                changed += (char) (ch - 32); 
            } else {
                changed += ch; 
            }
        }
        return changed;
    }
}
