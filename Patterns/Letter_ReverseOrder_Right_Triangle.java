package Patterns;

public class Letter_ReverseOrder_Right_Triangle {
  public static void main(String[] args) {
    int n=5;
  for(int i=0;i<n;i++)
    {
      for(char c =(char)(int)('A'+n-1);c>=(char)(int)('A'+n-1-i);c--)
      {
          System.out.print(c+" ");
      }
      System.out.println();
    }
  } 
}
