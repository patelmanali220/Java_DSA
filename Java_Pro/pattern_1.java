package Java_Pro;
import java.util.*;
public class pattern_1 {
  public static void main(String[] args) {
    int k;
      for(int i=1;i<=3;i++){
        k=0;
          for(int j=1;j<=5;j++){
              if(j>=(4-i) && j<=(2+i) && k==0){
                  System.out.print("*");
                  k=1;
              }
                 
              else{
                  k=0;
                   System.out.print(" ");
              }
          }
          System.out.println();
      }
      }
}
