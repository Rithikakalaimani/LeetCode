package Strings;

public class Rotate_String {
    public static boolean rotateString(String s, String goal) {
      String s3 = goal.concat(goal);
      if(s.length()!=goal.length())
      {
        return false;
      }
      if(s3.contains(s))
      {
        return true;
      }
      else
      {
        return false;
      }
  }
  public static void main(String[] args) {
    String s1 = "abcde";
    String goal1 = "cdeab";
    String s2 = "abcde";
    String goal2 = "abced";
    System.out.println(rotateString(s1,goal1));
    System.out.println(rotateString(s2,goal2));
  }
}
  

