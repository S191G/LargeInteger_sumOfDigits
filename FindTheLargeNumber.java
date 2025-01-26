import java.util.*;
public class FindTheLargeNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the First number:");
        int a =sc.nextInt();
        System.out.println("Enter the Second number:");
        int b =sc.nextInt();
        System.out.println("Enter the Third number:");
        int c =sc.nextInt();
        //Approach---->Logic
        /*if(a>b && a>c){
            System.out.println(a+" "+"is the largest number");
        }else if (b>a && b>c) {
            System.out.println(b+" "+"is the First number");
        }else{
            System.out.println(c+" "+"is the largest number");
        }*/

        //Approach ----> 2-[Terenary-Operator] 
        int largest=a>b?a:b;
        int largest2=c>largest?c:largest;
        System.out.println(largest2 + " "+"is the largest number");
    }
}