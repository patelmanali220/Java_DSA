package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
  public static void main(String[] args){
    String[] str = new String[5];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<str.length;i++){
      str[i]= sc.next();
    }
    System.out.println(Arrays.toString(str));
    str[3] = "mannu";
    System.out.println(Arrays.toString(str));
  }
}
