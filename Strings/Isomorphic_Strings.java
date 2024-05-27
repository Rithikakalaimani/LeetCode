package Strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {
  public static boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length())
    {
      return false;
    }
    Map<Character, Character> m = new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
      char org = s.charAt(i);
      char rep = t.charAt(i);
      if(!m.containsKey(org))
      {
        if(!m.containsValue(rep))
        {
          m.put(org,rep);
        }
        else
        {
          return false;
        }
      }
      else
      {
        // char orgi = m.get(org);
        if(m.get(org)!=rep)
        {
          return false;
        }
      }
    }
   return true;  
  }
  public static void main(String[] args) {
    String s1 = "egg";
    String t1 = "add";
    String s2 = "foo";
    String t2 = "bar";
    System.out.println(isIsomorphic(s1,t1));
    System.out.println(isIsomorphic(s2,t2));
  }
}

