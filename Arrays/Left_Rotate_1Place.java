public class Left_Rotate_1Place{
  public static void main(String args[]) {
  int n=5;
  int a[]= {1,2,3,4,5};
  solve(a, n);
}
 public static void solve(int a[], int n) {
  int temp = a[0]; 
  for (int i = 0; i < n - 1; i++) {
    a[i] = a[i + 1];
  }
  a[n - 1] = temp; 
  for (int i = 0; i < n; i++) {
    System.out.print(a[i]+" ");
  }
  }
}

