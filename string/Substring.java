package start.build.string;
public class Substring {
    public static void main(String[] args) {
        String str = "ashu shelke"; 

        int n = str.length();
        int[] lastIndex = new int[256]; 
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1; 
        }

        int start = 0;          
        int maxLength = 0;      
        int startIndex = 0;    

        for (int end = 0; end < n; end++) {
            char ch = str.charAt(end);

          
            if (lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1;
            }

            lastIndex[ch] = end;

            int length = end - start + 1;
            if (length > maxLength) {
                maxLength = length;
                startIndex = start;
            }
        }

       
        System.out.print("Longest non-repeating substring: ");
        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("\nLength: " + maxLength);
    }
}
