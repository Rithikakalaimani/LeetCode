package Patterns;

public class Symmetric_Void_StarPattern {
  public static void main(String[] args) {
    int n=5;
    int s =0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-i;j++)
      {
          System.out.print("*"+" ");
      }
      for(int k=0;k<s;k++)
      {
          System.out.print(" ");
      }
      for(int j=0;j<n-i;j++)
      {
          System.out.print("*"+" ");
      }
      s=s+2;
      System.out.println();
    }
    int l=2*(n-1);
    for(int i=0;i<n;i++)
  {
      for(int j=0;j<i+1;j++)
      {
          System.out.print("*"+" ");
      }
      for(int k=0;k<l;k++)
      {
          System.out.print(" ");
      }
      for(int j=0;j<i+1;j++)
      {
          System.out.print("*"+" ");
      }
      l=l-2;
      System.out.println();
    }
  }
  
}
