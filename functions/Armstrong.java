package functions;

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.println("3 digit Armstrong num:");
    // int n = sc.nextInt();
    for(int i=100; i<1000 ; i++){
    CheckArms(i);
    }
  }
  static void CheckArms(int n){
    int temp = n;
    int sum = 0;
    int r;
    while(n>0){
      r=n%10;
      sum= sum + (r*r*r);
      n = n/10;
    }
    if(sum == temp){
      System.out.println( temp /*+" is an armstrong number"*/);
    }
    // else{
    //   System.out.println(temp + " is not an armstrong number");
    // }
  }
}
