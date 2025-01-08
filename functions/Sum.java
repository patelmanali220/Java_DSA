package functions;

import java.util.Scanner;

public class Sum {
  
 public static void main(String[] args){

 int r = sum();
  System.out.println( "Sum:"+ r);

 }

 static int sum(){
  Scanner sc = new Scanner(System.in);
  int n1 = sc.nextInt();
  int n2 = sc.nextInt();
int c = n1+n2;

return c;
 }

}
