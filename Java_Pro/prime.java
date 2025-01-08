package Java_Pro;

public class prime {

    public static void main(String[] args) {
int flag=0;
int n=17;
for(int i=2; i<=n/2;i++){
    if(n%i==0){
        flag=1;
    }
}
if(flag==0){
    System.out.println("prime");
}
else{
   System.out.println("not prime"); 
}

  }
}
