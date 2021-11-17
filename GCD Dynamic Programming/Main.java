import java.util.*;
import java.lang.*;
public class Main{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the two numbers to find GCD:");
 System.out.println("GCD of two numbers is : " 
+gcd(sc.nextInt(),sc.nextInt()));
 }
 public static int gcd(int a, int b){
 if (a == 0){
 return b;
 }
 return gcd(b%a, a);
 }
}
