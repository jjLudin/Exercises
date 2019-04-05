import java.util.HashMap;
import java.util.Map;

// Given an array of size n, find the majority element. 
// The majority element is the element that appears more than floor(n/2) times.
// You may assume that the array is non-empty and the majority element always exist in the array.
// Example 1: Input: [3,2,3] Output: 3
// Example 2: Input: [2,2,1,1,1,2,2] Output: 2

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = new int[] {3, 2, 3};
        int answer = findMajorityElement(array);
        System.out.println(answer);
    }

    private static int findMajorityElement(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int majorityElement = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().compareTo(majorityElement) >= 0) {
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}