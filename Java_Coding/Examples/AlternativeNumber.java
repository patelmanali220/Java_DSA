package Examples;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AlternativeNumber {
  public static void main(String[] args) {
    int []arr;
    arr = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The numbers are: ");
    // for (int i = 0; i < 10; i=i+2) {
    //   System.out.print(arr[i] + " ");
    // }
 IntStream.range(0, 10).filter(i -> i % 2 == 0).forEach(i -> System.out.print(arr[i] + " "));

  }
}
