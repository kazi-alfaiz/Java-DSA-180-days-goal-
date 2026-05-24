

public class Maths {
    /*static void printNumber(int number) {

        while (number != 0) {
            int digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
    }*/

/*
    static int  CountNumber(int number) {

        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            count ++;
                    number = number / 10;
        }
        return count;
    }*/

 /*   static int SumOfAllNumber(int number) {

        int sum=0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }*/

/*

 static int  ReverseNumber(int number) {

        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
        return number;
    }

    static int Revnumber(int number) {
     int revNum=0;
        while (number != 0) {
            int digit = number % 10;
            revNum=revNum+digit;
            number = number / 10;
        }
        return revNum;
    }






 static Boolean IsPalindrome(int num) {
     int orginal = num;
     int reversed = Revnumber(num);
     if (reversed == orginal) {
         System.out.println("It is Palindrome");
         return true;
     }else  {
         System.out.println("It is not Palindrome");
   return false;
     }

 }
*/
    /*static boolean isPrime(int n){
        for (int i = 2; i <=n-1 ; i++) {
            if (n%i == 0){
                return false;
            }
        }return true;
    }

    static boolean isSecPrime(int n){
        for (int i = 2; i*i <=n ; i++) {
            if (n%i == 0){
                return false;
            }
        }return true;
    }*/
/*
static int FindGCD(int a, int b){

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;

    }
    int ans=a;
    return ans;

}
 static int FindLCM(int a, int b){
    int gcd=FindGCD(a,b);
    int product=a*b;
    int lcm=product/gcd;
    return lcm;
 }
*/
/*
static boolean FindAmstrongNumber(int num ){

    int sum=0;
    int original=num;
    while(num!=0){
        int digit=num%10;
        int Cube=digit*digit*digit;
        sum+=Cube;
        num=num/10;
    }
    if(sum==original){
        return true;
    }else{
        return false;
    }



*/

        static boolean checkPerfectNumber(int num){
            int sum=1;

            for(int i =2; i*i<=num;i++){
                if(num%i==0){}
            }
            return false;
        }





    }



    static void main() {

        int number = 7;
        /*  System.out.println(CountNumber(number));*/
        /*printNumber(number);*/
        /*System.out.println(SumOfAllNumber(number));*/
//       ReverseNumber(number);
/*
        System.out.println(Revnumber(number));

        boolean palindrome = IsPalindrome(number);
*/
        /*System.out.println(isPrime(number));
        System.out.println(isSecPrime(number));*/
        /*  System.out.println(FindGCD(12,18));*/
/*
        System.out.println(FindAmstrongNumber(155));


    }

*/
    }

