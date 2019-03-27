// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
// Note: For the purpose of this problem, we define empty string as valid palindrome.
// Example 1: Input: "A man, a plan, a canal: Panama" Output: true
// Example 2: Input: "race a car" Output: false

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean answer = isPalindrome(s);
        System.out.println(answer);
    }

    private static boolean isPalindrome(String s) {
        if (s == "") {
            return true;
        }

        String myString = s.replaceAll(" ", "");
        myString = myString.replaceAll("[^A-Za-z]", "");
        myString = myString.toLowerCase();

        char[] myCharArray = myString.toCharArray();

        int i = 0;
        int j = myCharArray.length - 1;
        while (i < j) {
            if (myCharArray[i] != myCharArray[j]) {
                return false;
            }
            
            i++;
            j--;
        }

        return true;
    }
}