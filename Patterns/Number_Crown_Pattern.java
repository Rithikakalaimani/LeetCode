package Patterns;

public class Number_Crown_Pattern {
  public static void main(String[] args) {
    int n =5;
    int s = 2*(n-1);
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i+1;j++)
      {
        System.out.print(j+1+" ");
      
      } 
      for(int k=0;k<=s;k++)
      {
      System.out.print(" ");
      }
      
      for(int x =i+1;x>=1;x--)
      {
          System.out.print(x+" ");
      
      }
      System.out.println();
      s=s-2;
   }     
 }
  
}
