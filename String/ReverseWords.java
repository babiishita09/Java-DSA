package String;

/*
    Reverse Words in a String-----------------------------------------------------------------------------------------------
 */

public class ReverseWords {

    public static String reverseWords(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for(int i = words.length-1; i>= 0; i--){
            res.append(words[i]);

            if(i != 0){
                res.append(" ");
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s= "   My   name is ishita     ";
        System.out.println(reverseWords(s));
    }
}
