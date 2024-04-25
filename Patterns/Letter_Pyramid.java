package Patterns;

public class Letter_Pyramid {
  public static void main(String[] args) {
    int n=5;
  for (int i = 0; i < n; i++) {
      char coefficient = 'A';     
      for (int j = 0; j < n - i - 1; j++) {
          System.out.print("  ");
      }
      for (int k = 0; k <= i; k++) {
          System.out.print((char) (coefficient + k) + " ");
      }
      for (int k = i - 1; k >= 0; k--) {
          System.out.print((char) (coefficient + k) + " ");
      }
      System.out.println();
    }
  }
  
}
