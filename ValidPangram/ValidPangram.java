// A pangram is where exactly all letters in the alphabet show up at least once in a sentence
// Example: The quick brown fox jumps over the lazy dog

import java.util.HashMap;
import java.util.Map;

public class ValidPangram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        boolean answer = isPangram(s);
        System.out.println(answer);
    }

    private static boolean isPangram(String s) {
        if (s == "") {
            return false;
        }

        String myString = s.replaceAll(" ", "");
        myString = myString.replaceAll("[^A-Za-z]", "");
        myString = myString.toLowerCase();

        char[] myCharArray = myString.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0); map.put('b', 0); map.put('c', 0); map.put('d', 0); map.put('e', 0);
        map.put('f', 0); map.put('g', 0); map.put('h', 0); map.put('i', 0); map.put('j', 0);
        map.put('k', 0); map.put('l', 0); map.put('m', 0); map.put('n', 0); map.put('o', 0);
        map.put('p', 0); map.put('q', 0); map.put('r', 0); map.put('s', 0); map.put('t', 0);
        map.put('u', 0); map.put('v', 0); map.put('w', 0); map.put('x', 0); map.put('y', 0);
        map.put('z', 0);

        for (char c : myCharArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                return false;
            }
        }

        return true;
    }
}