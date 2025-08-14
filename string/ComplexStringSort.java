package start.build.string;

public class ComplexStringSort {
    public static void main(String[] args) {
        String input = "Ba2@Ac3!b";

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specials = new StringBuilder();

     
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                specials.append(ch);
            }
        }

 
        char[] letterArray = letters.toString().toCharArray();
        for (int i = 0; i < letterArray.length - 1; i++) {
            for (int j = i + 1; j < letterArray.length; j++) {
                if (Character.toLowerCase(letterArray[i]) > Character.toLowerCase(letterArray[j])) {
                    char temp = letterArray[i];
                    letterArray[i] = letterArray[j];
                    letterArray[j] = temp;
                }
            }
        }


        char[] digitArray = digits.toString().toCharArray();
        for (int i = 0; i < digitArray.length - 1; i++) {
            for (int j = i + 1; j < digitArray.length; j++) {
                if (digitArray[i] > digitArray[j]) {
                    char temp = digitArray[i];
                    digitArray[i] = digitArray[j];
                    digitArray[j] = temp;
                }
            }
        }

        String result = new String(letterArray) + new String(digitArray) + specials.toString();
        System.out.println("Output: " + result);
    }
}
