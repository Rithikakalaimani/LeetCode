package Strings;

public class Remove_Outermost_Parenthesis {
    public static  String removeOuterParentheses(String s) {
        int cnt = 0;
        String s1 ="";
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == ')') {
            cnt--;
            }
            if (cnt != 0) {
                s1+=s.charAt(i);
            }
            if (s.charAt(i) == '(') {
                cnt++;
            }
        }
        return s1;
    }
    public static void main(String[] args) {
      String s1 = "(()())(())";
      String s2 = "(()())(())(()(()))";
      String s3 = "()()";
      System.out.println(removeOuterParentheses(s1));
      System.out.println(removeOuterParentheses(s2));
      System.out.println(removeOuterParentheses(s3));
    }
}

