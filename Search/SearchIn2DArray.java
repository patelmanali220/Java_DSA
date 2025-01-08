package Search;

public class SearchIn2DArray {
  
 public static void main(String[] args){
  int[][] arr = {
    {22,25,11},
    {18,41,74,2},
    {78,19,26,33,21},
    {10,6}
  };
  int target = 33;
  int[] a = search(arr, target);
  System.out.println(a);
 }

 static int[] search(int[][] arr, int target){
  for(int r=0; r<arr.length; r++){
    for(int c=0; c<arr[r].length; c++){
     if(arr[r][c] == target){
      return new int[]{r,c};
     }
    }
  }
  return new int[]{-1, -1};
 }

}
