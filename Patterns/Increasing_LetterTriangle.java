package Patterns;
public class Increasing_LetterTriangle {
  public static void main(String[] args) {
    int n =5;  
    for(int i=0;i<n;i++)
    {
      char s ='A';
      for(int j=0;j<i+1;j++)
      {
          System.out.print(s+" ");
          s++;
      }
      System.out.println();
    }
  }
}
