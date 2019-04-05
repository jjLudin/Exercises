// Given two strings s and t , write a function to determine if t is an anagram of s.
// Example 1: Input: s = "anagram", t = "nagaram" Output: true
// Example 2: Input: s = "rat", t = "car" Output: false

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean answer = isAnagram(s, t);
        System.out.println(answer);
    }

    private static boolean isAnagram(String s, String t) {
        if ((s == "" || t == "") || (s.length() != t.length())) {
            return false;
        }

        String _s = s.toLowerCase();
        String _t = t.toLowerCase();

        char[] sArray = _s.toCharArray();
        char[] tArray = _t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length - 1; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }

        return true;
    }
}