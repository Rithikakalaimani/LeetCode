package Patterns;
public class Reverse_Pyramid {
  public static void main(String[] args) {
    int n =5;
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
