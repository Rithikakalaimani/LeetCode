public class Left_Rotate_DPlaces{
  public static void Reverse(int[] a, int start, int end) {
    while (start <= end) {
      int temp = a[start];
      a[start] = a[end];
      a[end] = temp;
      start++;
      end--;
    }
  }
  public static void Rotateeletoleft(int[] a, int n, int k) {
    Reverse(a, 0, k - 1);
    Reverse(a, k , n - 1);
    Reverse(a, 0, n - 1);
  }
  public static void main(String args[]) {
    int[] a = {1,2,3,4,5,6,7};
    int n = 7;
    int k = 2;
    Rotateeletoleft(a, n, k);
    System.out.print("After Rotating the k elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }
}