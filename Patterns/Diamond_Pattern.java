package Patterns;
public class Diamond_Pattern {
  public static void main(String[] args) {
    int n=5;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n+i;j++)
      {
        if(j<n-i-1)
        {
          System.out.print(" ");
        }
        else
        {
          System.out.print("*");
        }        
      }
        System.out.print("\n");
    }
    int l;
    for(int i=0;i<n;i++)
    {
      l = i+(2*n)-(2*i+1);
      for(int j=0;j<l;j++)
      {
        if(j<i)
        {
          System.out.print(" ");
        }
        else
        {
          System.out.print("*");
        }        
       }
    System.out.print("\n");
    }    
  }
}
