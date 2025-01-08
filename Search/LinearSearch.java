package Search;

import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args){
    int[] arr = {4,5,-27,13,88,19,14,-5,7,11};
    Scanner sc = new Scanner(System.in);
    System.out.println("enter target value");
    int target= sc.nextInt();
    Search(arr, target);
  }
  static void Search(int[] arr, int target){
    for(int i=0; i<arr.length; i++){
      int e = arr[i];
      if(e == target){
        System.out.println("element found");
      }
      
    }
    
  }
}
