package Patterns;

public class Symmetry_StarPattern {
  public static void main(String[] args) {
    int n=5;
     int s =2*(n-1);
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i+1;j++)
      {
          System.out.print("*"+" ");
      }
      for(int k=0;k<s;k++)
      {
          System.out.print("  ");
      }
      s=s-2;
      for(int j=0;j<i+1;j++)
      {
          System.out.print("*"+" ");
      }
      System.out.println();
    }
    int m=2;
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
      {
          System.out.print("*"+" ");
      }
      for(int k=0;k<m;k++)
      {
          System.out.print("  ");
      }
      m=m+2;
      for(int j=0;j<n-i-1;j++)
      {
          System.out.print("*"+" ");
      }
      System.out.println();
    }
  } 
}
