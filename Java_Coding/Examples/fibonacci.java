package Examples;

public class fibonacci {
  public static void main(String[] args){
    int n=10;
    int n1= 0;
    int n2= 1;
    System.out.print(n1+" "+n2);
    fibon(n1,n2,n);
  }

  public static void fibon(int n1, int n2, int n){
    int n3;
    if(n>0){
      n3=n1+n2;
      System.out.print(" "+n3);
      n1=n2;
      n2=n3;
      fibon(n1,n2,n-1);
    }
  }

}
