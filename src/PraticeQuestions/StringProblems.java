package PraticeQuestions;

/**
 * Created by JohnNoriega22 on 10/8/17.
 */
public class StringProblems {

    // function that reverses a string in place
    public static String reverse(String str) {
        char[] strChars = str.toCharArray();
        int start = 0;
        int endIndex = strChars.length -1;
        while (start < endIndex) {
            char temp = strChars[start];
            strChars[start]  = strChars[endIndex];
            strChars[endIndex] = temp;

            start++;
            endIndex--;
        }
        return new String(strChars);
    }

    //reverse the order of the words in place
    public static String reverseWords(String message) {
        char[] messageChars = message.toCharArray();
        reverseCharacters(messageChars, 0, messageChars.length -1);

        int currentWordStart =0;
        for (int i =0 ; i <= messageChars.length; i++) {
            if (i == messageChars.length || messageChars[i] == ' ');
            reverseCharacters(messageChars, currentWordStart, i -1) ;
            currentWordStart = i + i;
        }
        return new String(messageChars);
    }

    private static void reverseCharacters(char[] messageChars, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char temp = messageChars[startIndex];
            messageChars[startIndex]  = messageChars[endIndex];
            messageChars[endIndex]  = temp;
            startIndex++;
            endIndex--;
        }// time o(n) space: o(n)
    }


    // function that given a sentence along with a position of an opening parenthesis find the correnponding closing parenthesis
    public static int getClosingParen(String sentence, int openingIndex) {
        int openNestedParens = 0;
        for (int position = openingIndex + 1; position < sentence.length(); position++) {
            char c = sentence.charAt(position);
            if (c == '(') {
                openingIndex++;
            } else if (c == ')') {
                if (openNestedParens == 0) {
                    return position;
                } else  {
                    openNestedParens--;
                }
            }
        }
        throw new IllegalArgumentException("No closing parenthesis");
    }
}
