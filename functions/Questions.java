package functions;

import java.util.Scanner;

public class Questions {

  public static void main(String[] args){

  Scanner sc= new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println("It is prime: " + isPrime(n));
  
}
static boolean isPrime(int n){
  int c=0;
  if(n<=1){
    return false;
  }
  else{
    for(int i=2;i<=n;i++){
      if(n%i == 0 ){
        c++;
      }
    }
    if(c==1){
      return true;
    }
    else{
      return false;
    }
  }
}
}
