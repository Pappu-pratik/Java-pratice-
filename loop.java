    //while loop
// print number 1 to 10
/*public class loop {
    public static void main(String args[]){
        int counter =0;
        while (counter<100){
            System.out.println("HELLO WORLD");
            counter++;
        }
        System.out.println("Printed loop 100x time");
    }
}*/

/*public class loop {
    public static void main (String args []){
        int counter=1;
        while(counter<=10){
            System.out.print(counter + "  ");
            counter++;
        }
    }
}*/

/*import java.util.*;
public class loop {
    public static void main (String args []){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your range ");
        int range=sc.nextInt();
        int counter=1;
        while(counter<=range){
            System.out.print(counter + "  ");
           counter++;
        }
    }
}*/
    //Sum of first n no.
/*import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.");
        int n= sc.nextInt();
        int sum =0;

        int i=1;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}*/

/*
import java.util.*;
public class loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum= 0;

        int i=1;
        while(i<=n) {
            sum=sum+ i;
            i++;
            System.out.print("sum is:"+sum );

        }

    }
}

 */

    // for loop
/*public class loop{
    public static void main (String args[]){
        for(int i=1; i<=10; i++) {
            System.out.println("JAI SHREE RAM");
        }
        for(int LINE=1; LINE<=4; LINE++){
            System.out.println("****");

        }
    }
}*/

// print reverse of a number
/* import java.util.*;
    public class loop{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            while(n>0){
                int lastDigit=n%10;
                System.out.print(lastDigit);
                n=n/10;
            }
        }
    }*/


/*import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no to be reverse");
        int n= sc.nextInt();
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        System.out.print(rev);
    }
}*/

    //Do while loop
/*
import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
       int counter=1;
        do {
            System.out.println("JAI SHREE RAM");
            counter++;
        }
        while(counter<=n);
    }
}

 */

    //Break statement
/*
public class loop {
    public static void main(String args[]) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("JAI SHREE RAM");
            if (i == 5) {
                break;
            }
        }
            System.out.println("i am out");

    }
}

 */


    // print user number till user enter multiple of 10
/*import java.util.*;
public class loop{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number");
            int n = sc.nextInt();
            if(n%10==0) {
                break;
            }
        }while(true);
    }
}*/


// continue statement (skip the given codition)

/*import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was : "  +  n);
        }
        while (true);
    }
}*/

/*
public class loop {
    public static void main(String args[]) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i +"  ");
        }

    }
}

 */
/*
public class loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }
    }
}*/
