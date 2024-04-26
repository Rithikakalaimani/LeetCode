package Patterns;

public class Number_SquarePattern {
  public static void main(String[] args) {
    int n=5;
    int size = 2 * n - 1;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
          int minDist = Math.min(i, j);
          minDist = Math.min(minDist, size - i - 1);
          minDist = Math.min(minDist, size - j - 1);
          System.out.print(n - minDist);
      }
      System.out.println();
    }
  } 
}
