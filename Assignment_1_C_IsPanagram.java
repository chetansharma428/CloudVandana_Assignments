import java.util.*;  

public class Assignment_1_C_IsPanagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence to check for Panagram:");
        System.out.println("Example Sentence: 'The quick brown fox jumps over the lazy dog'");
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to mark the presence of each letter from 'a' to 'z'
        boolean[] alphabetPresent = new boolean[26];

        // Convert the input to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Iterate through the input string and mark the presence of each letter
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
