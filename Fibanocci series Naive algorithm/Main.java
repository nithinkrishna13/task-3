import java.util.*;
public class Fibo{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number to calculate series: ");
 int n=sc.nextInt();
 for(int i = 0; i <n; i++){
System.out.print(Fib(i) +" ");
}
}
 
 static int Fib(int n){
 if(n<=1){
 return n;
 }
 else return Fib(n-1)+Fib(n-2);
 }
}
