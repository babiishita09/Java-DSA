package String;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    //using hashmap-----------------------------------------------

    private static boolean isAnagram(String s, String t) {

        Map<Character, Integer> count = new HashMap<>();

//        count the frequency of character in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

//       decrement the frequency of character in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

//        checking any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }


//    Using HashTable (Frequency Array)-----------------------------------------------------

    static final int MAX_CHAR = 26;

    private static boolean anagramCheck(String s1, String s2) {
        int[] freq = new int[MAX_CHAR];

//        count frequency of ech character in string s
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

//        count frequency of each character in string s2
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

//        check if all frequency are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
        System.out.println(anagramCheck(s, t));
    }
}
