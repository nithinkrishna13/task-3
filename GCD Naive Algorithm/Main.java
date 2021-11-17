import java.lang.Math;
import java.util.Scanner;
public class Main {
 public static void main(String[] args){
 System.out.println(GCD(20,42));
 }
 static int GCD(int a,int b) {
 int maximum=Math.max(a,b);
 int num=maximum-1;
 while(num>1){
 if((a%num==0)&&(b%num==0)){
 return num;
 } else {
 num--;
 }
 
 }
 return 1;
 }
}
