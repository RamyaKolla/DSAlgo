public class AnyNumberSumUptoK {

	 public static void main(String[] args)
	 {
	  int[]arr={4,6,2,8};
	  System.out.println(isSumPossible(arr,22));
	  System.out.println(isSumPossibleRecur(arr,22));
	 }

	 public static boolean isSumPossible(int[] arr, int k)
	 {
	  boolean[][] memo=new boolean[arr.length+1][k+1]; 
	  //arr.length+1 because we need to store 4; k+1 because we need to store 22;
	  
	  for(int i=1;i<=arr.length;++i)//anyway memo[0][j] is always false 
	  {
	   for(int w=1;w<=k;++w)
	   {
	    if(w==arr[i-1]){
	     memo[i][w]=true;
	     System.out.println("memo["+i+"]["+w+"] : "+memo[i][w]);
	    }
	    else if(w>arr[i-1]){
	     memo[i][w]=memo[i-1][w]||memo[i-1][w-arr[i-1]];
	     System.out.println("Nnn  memo["+i+"]["+w+"] : "+memo[i][w]);
	    }
	    else{
	     memo[i][w]=memo[i-1][w];
	     System.out.println("Pppp  memo["+i+"]["+w+"] : "+memo[i][w]);
	    }
	   }
	  }
	  return memo[arr.length][k];
	 }
	 
	 public static boolean isSumPossibleRecur(int[]arr, int k)
	 {
	  Boolean [][]memo=new Boolean[arr.length+1][k+1];
	  return isSumPossibleRecur(memo,arr,0,k);
	 }
	 
	 private static boolean isSumPossibleRecur(Boolean[][]memo, int[]arr,int i,int k)
	 {
	  if(memo[i][k]!=null)
	   return memo[i][k];
	  if(i==arr.length-1)
	  {
	   if(arr[i]==k||k==0)
	    return true;
	   else
	    return false;
	  }
	  if(arr[i]>k)
	  {
	   memo[i][k]=isSumPossibleRecur(memo,arr,i+1,k);
	   return memo[i][k];
	  }
	  memo[i][k]=isSumPossibleRecur(memo,arr,i+1,k-arr[i])||isSumPossibleRecur(memo,arr, i+1, k);
	  return memo[i][k];
	 }
	}
