package String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStrintWithoutRepeatingChar {

    static int lengthOfLongestSubString(String s) {
//    use a HashSet to store the characters in the current window without duplicates
        Set<Character> charSet = new HashSet<>();

//      Initialize the left pointer to the sliding window
        int leftPointer = 0;
//      Variable to keep track of the longest subString length
        int maxLength = 0;

//      Iterate through the string with the right pointer
        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
//          Current character at the rightPointer
            char currentChar = s.charAt(rightPointer);

//          If currentCurr is already in the set, it means we have found a repeating character
//          we slide the left pointer of the window to the right until the duplicate is removed
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(leftPointer++));

            }

//          Add the current character to the set as it is now unique in the current window
            charSet.add(currentChar);

//          Calculate the length of the current window (rightPointer - leftPointer +1)
//          Update the maxLength if the current window is large
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }

        return maxLength;

    }


    public static void main(String args[]) {
        String s = "abggtracdaabcin";
        System.out.println(lengthOfLongestSubString(s));
    }
}
