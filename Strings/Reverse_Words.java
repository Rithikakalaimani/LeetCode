package Strings;

public class Reverse_Words {
    public static String reverseWords(String str) {
    String[] s = str.trim().split("\\s+");
    StringBuilder reversed = new StringBuilder();
    for (int i = s.length - 1; i >= 0; i--) {
        reversed.append(s[i]);
        if (i != 0) {
            reversed.append(" ");
        }
    }
    return reversed.toString();  
    }
    public static void main(String[] args) {
      String s1 = "the sky is blue";
      String s2 = "  hello world  ";
      String s3 = "a good   example";
      System.out.println(reverseWords(s1));
      System.out.println(reverseWords(s2));
      System.out.println(reverseWords(s3));
    }
}
  
