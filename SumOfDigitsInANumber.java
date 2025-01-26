public class SumOfDigitsInANumber {
    public static void main(String[]args){
        int num = 23456789;
        int sum= 0;
        while (num>0) {
            sum=sum+num%10;
            num = num/10;
        }
        System.out.println("Sum of the Digits in the given number are:"+sum);
    }
}
