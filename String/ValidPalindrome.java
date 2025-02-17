package String;

/*
    Valid Palindrome------------------------------------------------------------
 */
public class ValidPalindrome {

    static boolean isPalindrome(String s) {
        int leftPointer = 0, rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {

//      Skip non alphabet character from left
            if (!Character.isLetterOrDigit(s.charAt(leftPointer)))
                leftPointer++;
//      Skip non alphabet character from right
            else if (!Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer--;
            } else if (Character.toLowerCase(s.charAt(leftPointer)) == Character.toLowerCase(s.charAt(rightPointer))) {
                leftPointer++;
                rightPointer--;
            } else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));


    }

}
