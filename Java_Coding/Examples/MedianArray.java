package Examples;

public class MedianArray {
  public static void main(String[] args) {
  int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int n = arr.length;
  int m=n/2;

  if(n%2==0){
   
    System.out.println("Median is: "+(arr[m-1]+arr[m])/2);
  }
  else{

    System.out.println("Median is: "+arr[m]);
  }
}
}