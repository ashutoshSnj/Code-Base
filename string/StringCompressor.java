package start.build.string;

public class StringCompressor {
    public static void main(String[] args) {
        String input = "aaAAAbbCCc";
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            char currentChar = input.charAt(i);
            int count = 1;

            int j = i + 1;
            while (j < input.length() &&
                    Character.toLowerCase(input.charAt(j)) == Character.toLowerCase(currentChar)) {
                count++;
                j++;
            }

           
            if (count > 1) {
                result.append(currentChar).append(count);
            } else {
                result.append(currentChar);
            }

            i = j; 
        }

        System.out.println("Output: " + result.toString());
    }
}
