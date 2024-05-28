package Strings;

public class Valid_Anagaram {
   public static boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
    {
      return false;
    }
    int[]freq = new int[26];
    for(int i=0;i<s.length();i++)
    {
      freq[s.charAt(i)-'a']++;
    }
    for(int i=0;i<t.length();i++)
    {
      freq[t.charAt(i)-'a']--;
      if(freq[t.charAt(i)-'a']<0)
      {
        return false;
      }
    }
    return true;
  }
  public static  void main(String[] args) {
    String s1 = "anagram";
    String t1 = "nagaram";
    String s2 = "rat";
    String t2 = "car";
    System.out.println(isAnagram(s1,t1));
    System.out.println(isAnagram(s2,t2));
  }
}
