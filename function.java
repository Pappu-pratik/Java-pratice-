/*import java.util.*;
public class function {
    public static void printHelloWorld(){
        System.out.println("hello World");
        System.out.println("hello World");
        System.out.println("hello World");
        return;
    }
    public static int calculateSum(int a, int b) {  //parameter or formal parameter

        int sum = a + b;

        return sum;
    }
    public static void main(String nargs[]){
        printHelloWorld();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a ");
        int a = sc.nextInt();

        System.out.println("enter the value of a ");
        int b = sc.nextInt();
        int sumTo = calculateSum(a,b); // arguments or actual parameters
        System.out.println("sum is: "+sumTo);
    }
}*/

// swap two number

/*
public class function {
    public static void swap(int a,int b){
    int temp = a;
    a=b;
    b=temp;

    System.out.println("a : "+a);
    System.out.println("b : "+b);

    return;
    }
    public static void main(String args[]){
        int a=10;
        int b =5;
        swap(a,b);
    }
}*/

// find product of a&b

/*import java.util.*;
public class function {
    public static int factorial(int n){
    int f=1;
    for (int i=1; i<=n; i++){
        f=f*i;

    }
    return f; // factorial of n
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}*/
// binomial coefficient
/*import java.util.*;
public class function {
    public static int factorial(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;

        }
        return f; // factorial of n
    }
    public static int binomial(int n , int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nsr = factorial(n-r);

        int binomial = fac_n/ (fac_r * fac_nsr);
        return binomial;
    }

    public static void main(String args []){
       int binCoff=  binomial(5,2);
       System.out.println(binCoff);
    }
}*/


            //Function overloading

//using parameters
/*public class function {
    //sum of two no:
    public static int sum(int a, int b){
        return a+b;
    }
    //sum of three no:
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(5,10));
        System.out.println(sum(5,10,30));
    }
}*/

//using data type
/*
public class function {
    //sum of two no:
    public static int sum(int a, int b){
        return a+b;
    }
    //sum of three no:
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(5,10));
        System.out.println(sum(3.5f,1.5f));
    }
}*/



// check if a number is prime or not
/*
import java.util.*;
public class function {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();

        if (n==2){
            System.out.println("your number is prime:" +n);
        }else{
            boolean isPrime= true ;
            //int i = 2;i<=math.sqrt(n);i++(we can use this also instead of below loop)
            for (int i = 2;i<=n-1;i++){
                if (n%i==0){  // n is a multiple of i (i is not equal to 1 & n)
                    isPrime=false;
                }
            }
            if (isPrime == true) {
                System.out.println("your number is prime:" +n);
            }else {
                System.out.println("your number is not prime:" +n);
            }
        }

    }
}*/

// print prime in range
/*public class function {
    public static boolean isPrime(int n){
        for (int i = 2;i<=n-1;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInrange(int n){
        for(int i = 2; i<=n; i++){  //true
            if(isPrime(i)){
                System.out.print(i+(" "));
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeInrange(20);
    }
}*/

//convert from binary to decimal
/*public class function {
    public static void binToDec(int binNum){
        int myNum =binNum;
        int power=0;
        int decimalNum=0;
        while (binNum > 0){
            int lastDigit=binNum % 10;

            decimalNum=decimalNum + (lastDigit* (int)Math.pow(2, power));

            power++;
            binNum = binNum / 10;
        }
        System.out.print("decimal of "+ myNum + "=" + decimalNum);
    }
    public static void main(String args[]){
        binToDec(111);
    }
}*/

//convert from decimal to binary
/*public class function {
    public static void decToBin(int n){
        int myNum=n;
        int power=0;
        int binNum=0;

        while(n > 0){
            int rem =n%2;
            binNum=binNum + (rem * (int)Math.pow(10,power));

            power++;
            n=n/2;
        }
        System.out.print("binary of "+ myNum + "=" + binNum);
        }
    public static void main(String args[]){
        decToBin(7);
    }
}*/
