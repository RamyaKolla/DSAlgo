public class MaximumSumUptoKRecursive
{
 public static void main(String[] args)
 {
  int[]arr={4,6,3,9};
  System.out.println(getMaxSum(arr, 14));
 }
 public static int getMaxSum(int[]arr,int k)
 {
  Integer[][]memo=new Integer[arr.length+1][k+1];
  System.out.println("size: "+memo.length);
  return getMaxSum(memo,arr,0,k);
 }
 private static int getMaxSum(Integer[][]memo,int[]arr,int i,int k)
 {
  if(i==arr.length)
  {
	  System.out.println("Length is Zero: "+arr.length);
	  return 0;
  }
  
  System.out.println("Checking memo[i][k]: "+memo[i][k]+"  i: "+i+" k: "+k); 
  
  if(memo[i][k]!=null)
  {
	  System.out.println("memo[i][k]: "+memo[i][k]);
	  return memo[i][k];
  }
  if(arr[i]>k)
  {
   memo[i][k]=getMaxSum(memo,arr, i+1, k);
   System.out.println("Greater memo[i][k]: "+memo[i][k]);
   return memo[i][k];
  }
  
  System.out.println("Greater: "+(k-arr[i])+"  i: "+i+"  arr[i]: "+arr[i]);
  memo[i][k]=Math.max(getMaxSum(memo,arr,i+1,k), getMaxSum(memo,arr,i+1,k-arr[i])+arr[i]);
  System.out.println("Return memo["+i+"]["+k+"] : "+memo[i][k]+"  i: "+i+" k: "+k);
  return memo[i][k];
 }

}