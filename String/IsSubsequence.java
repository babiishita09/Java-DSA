package String;

/*
      Is Subsequence--------------------------------------------------
 */
public class IsSubsequence {

    static boolean isSubsequence(String s, String t) {
//  Initialize pointer for both of the strings
        int indexS = 0, indexT = 0;

//  Length of the two strings
        int lengthS = s.length(), lengthT = t.length();
//  Iterate over both strings
        while (indexS < lengthS && indexT < lengthT) {

//  Check if current character of s is matches the current character of t
            if (s.charAt(indexS) == t.charAt(indexT)) {
//  If they matches move the pointer of s forward
                ++indexS;
            }
//  Move the pointer of t forward
            ++indexT;
        }

/*
    If indexS is equal to the length of s, then all characters of s found in t in sequence
    Therefore s is subsequence of t
 */

        return indexS == lengthS;
    }

    public static void main(String[] args) {
        String s = "a#rftg";
        String t = "abcde#fg";

        System.out.println(isSubsequence(s, t));
    }

}
