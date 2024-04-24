package Patterns;
public class Half_DIamond_Pattern {
  public static void main(String[] args) {
    int n=5;
    for(int i=-n;i<=n;i++)
    {
      int l = (i<0)? n+i:n-i;
      for(int j=0;j<l;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }   
  }
}
