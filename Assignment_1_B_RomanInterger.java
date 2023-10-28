import java.util.HashMap;
import java.util.*;

public class Assignment_1_B_RomanInterger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the Roman Number you want to convert in Integer :");
        String romanNumeral = sc.nextLine(); // taking input from user here
        int result = romanToInt(romanNumeral); // getting result from romanToInt()
        System.out.println("Integer representation of " + romanNumeral + " is: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>(); // using hashmap to keep track of given input and accordingly using the value
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Calculating the Result here
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}
