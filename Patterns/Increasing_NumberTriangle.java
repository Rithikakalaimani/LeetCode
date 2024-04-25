package Patterns;
public class Increasing_NumberTriangle {
  public static void main(String[] args) {
    int n =5;
    int m=1;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i+1;j++)
      {
          System.out.print((m++)+" ");
      }
      System.out.print("\n");
    }
  }  
}
