package Patterns;

public class Alpha_Ramp_Pattern {
  public static void main(String[] args) {
  int n=5;
  char s ='A';
  for(int i=0;i<n;i++)
  {   
    for(int j=0;j<i+1;j++)
    {  
        System.out.print(s+" ");
    }
    System.out.println();
    s++;
    }
  }
}
