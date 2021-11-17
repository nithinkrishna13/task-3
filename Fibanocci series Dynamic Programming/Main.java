import java.util.*;
public class Main{
 public static void main (String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 
 int n=sc.nextInt();
 fib(n);
 }
 static void fib(int n){
 int f[] = new int[n+2];
 f[0] = 0;
 System.out.println("the fabinocci series is: ");
 f[1] = 1;
 System.out.print(f[0]+" "+f[1]+" ");
 for (int i = 2; i <n; i++){
 f[i] = f[i-1] + f[i-2];
 System.out.print(f[i]+" ");
 }
 }
 
}
