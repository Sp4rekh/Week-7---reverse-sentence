import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static String[] extractWords(String sentence) {
        return sentence.split(" ");
    }

    static String[] reverseArray(String[] words) {
        String[] reversedArray = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedArray[i] = words[words.length - 1 - i];

        }
        return reversedArray;
    }

    static String reconstructSentence(String[] words) {
        String reconstructedSentence = "";
        for (int i = 0; i < words.length; i++) {
            reconstructedSentence += words[i] + " ";
        }
        return reconstructedSentence;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence>\n");
        String val = input.nextLine();
        String[] sentence = extractWords(val);
        sentence = reverseArray(sentence);
        String finalSentence = reconstructSentence(sentence);
        System.out.println(finalSentence);
    }
}