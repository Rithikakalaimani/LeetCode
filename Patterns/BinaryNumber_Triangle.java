package Patterns;
public class BinaryNumber_Triangle {
  public static void main(String[] args) {
    int n=5;
   int s=1;
   for(int i=0;i<n;i++)
  {
    if(i%2==0)
    {
      s=1;
    }
    else
    {
      s=0;
    }
    for(int j=0;j<i+1;j++)
    {
      System.out.print(s);
      s=1-s;
    }
    System.out.println();
    }
  } 
}
