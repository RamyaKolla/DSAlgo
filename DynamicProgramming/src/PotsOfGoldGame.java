/*
 * Suppose the pots are arranged in L[0] to L[n]. 
 * First player can pick either L[0] or L[n]. If he picks L[0] Second player can pick 
 * either L[1] or L[n]. If first picks L[n], second player can pick L[0] or L[n-1]. 
 * As the second player is also playing optimally he will also use the same strategy as the first player. 
 * Let us assume f(i,j) is the number of coins a player would get if he plays optimally from a point when 
 * two ends are i and j (0<=i<=j<=n). So f(0,n) would be the number of coins that first player would get 
 * after playing optimally. As second player is also playing optimally, he will pick a pot such that after 
 * his picking first player will get fewer gold if played optimally. If second player takes pot number 1, 
 * player 1 will get f(2,n). If second player takes pot number n, first player will get f(1,n-1). 
 * Second player will play such that 1st player gets minimum of these two options. So if first player 
 * takes pot 0 his final count of gold will be L[0]+Min(f(2,n),f(1,n-1)). Similarly if he picks the last pot 
 * this total count will be L[n]+Min(f(0,n-2),f(1,n-1)). From these two items whichever is greater First 
 * player should pick that, and that should be his winning strategy as playing first.
 */
public class PotsOfGoldGame
{
 public static void main(String[] args)
 {
  int[] goldPots =
  { 12, 32, 4, 23, 6, 42, 16, 3, 85, 23, 4, 7, 3, 5, 45, 34, 2, 1 };
  int coins = getMaxGold(goldPots);
  System.out.println(coins);
 }

 private static int getMaxGold(int[] goldPots)
 {
  Integer[][]memo=new Integer[goldPots.length][goldPots.length];
  return getMaxGold(goldPots, 0, goldPots.length - 1,memo);
 }

 private static int getMaxGold(int[] goldPots, int startIndex, int endIndex,Integer[][]memo)
 {
  if (startIndex > endIndex)
   return 0;
  if(memo[startIndex][endIndex]!=null)
   return memo[startIndex][endIndex];
  int coinsIfStart = goldPots[startIndex]
    + Math.min(getMaxGold(goldPots, startIndex + 2, endIndex,memo),
      getMaxGold(goldPots, startIndex + 1, endIndex - 1,memo));
  int coinsIfEnd = goldPots[endIndex]
    + Math.min(getMaxGold(goldPots, startIndex, endIndex - 2,memo),
      getMaxGold(goldPots, startIndex + 1, endIndex - 1,memo));
  memo[startIndex][endIndex]=Math.max(coinsIfStart, coinsIfEnd);
  System.out.println("coinsIfStart :" +coinsIfStart+" coinsIfEnd: "+coinsIfEnd);
  System.out.println("memo["+startIndex+"]["+endIndex+"] : "+memo[startIndex][endIndex]);
  return memo[startIndex][endIndex];
 }
}