import java.util.ArrayList;
public class Rearrange_Neg_Pos {
public static int[] RearrangebySign(int[] A, int n){
  ArrayList<Integer> pos=new ArrayList<>();
  ArrayList<Integer> neg=new ArrayList<>();
  for(int i=0;i<n;i++){
      
      if(A[i]>0) pos.add(A[i]);
      else neg.add(A[i]);
  }
  for(int i=0;i<n/2;i++){
      
      A[2*i] = pos.get(i);
      A[2*i+1] = neg.get(i);
  }
  return A;
}    
public static void main(String args[]) 
{
  int n = 4;
  int A[]= {1,2,-4,-5};
  int[]ans= RearrangebySign(A,n);
  for (int i = 0; i < n; i++) {
    System.out.print(ans[i]+" ");
  }
}
}

