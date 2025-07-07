 /*import java.util.*;
public class conditional {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult : drive ,vote");
        }

        else if ((age > 13) && (age < 18)) {
            System.out.println("teenager");
        } else { 
            System.out.println("not adult");
        }
    }
}*/

       //Greatest of two number
/*import java.util.*;
public class conditional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of A : ");
        int A= sc.nextInt();

        System.out.println("Value of B : ");
        int B= sc.nextInt();
        if (A>B){
            System.out.println(A + (": A is the greatest number"));
        } else if (A==B) {
            System.out.println(B + (" : both the value is equal"));
        }else {
            System.out.println(B + (": B is gtreatest number"));
        }
    }
}*/

        // even or odd
/*   import java.util.*;
   public class conditional{
       public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter your number");
       int number=sc.nextInt();
       if(number%2 == 0) {
           System.out.println(number + (": your no. is odd"));
       }
           else{
               System.out.println(number + (": your no. is odd"));
           }
       }

   }*/


//income tax calculator

/*import java.util.*;
public class conditional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax = 0;
        if (income<500000){
            System.out.println(("your tax is: ") +tax  );
        } else if ((income>500000) & (income<=1000000)) {
            System.out.println(("your tax is: ") +(tax=(int) (income*0.2)));
        }
        else{
            System.out.println(("your tax is: ") +(tax=(int) (income*0.3)));
        }
    }
}*/

/*
import java.util.*;
public class conditional{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if (income<500000){
            tax= 0;
        }
        if ((income>=500000) && (income<=1000000) ) {
            tax = (int) (income * 0.2);
        }
        else { tax=(int) (income*0.3);
            }
System.out.println("Your tax is:" +tax);
    }
}*/
// largest of three number
/*public class conditional{
    public static void main(String args[]){
        int a=253, b =67, c=34;
        if((a>=b) && (a>=c)) {
            System.out.println("a is the largest number" + a);
        }
        else if(b>=c) {
            System.out.println(" is largest number" + b);
        }
        else {
            System.out.println("c is largest number"+c);

        }
    }
}*/
 // ternary operator
/*import java.util.*;
 public class conditional{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

         System.out.println("User number");
         int number=sc.nextInt();
         String type= ((number%2)==0)?"even" : "odd";
         System.out.println(type);

         System.out.println("Marks obtain");
         int marks= sc.nextInt();
         String report=(marks>=33)?"Pass":"Fail";
         System.out.println(report);
     }
}*/


 /*public class conditional{
     public static void main(String args[]){
         int number=2;
         switch(number){
             case 1: System.out.println("Light");
                      break;
             case 2: System.out.println("fan");
                 break;
             case 3: System.out.println("study lamp");
                 break;
             default : System.out.println("Electric supply cut");
         }
     }
 }*/


// switch statement
 /*import java.util.*;
 public class conditional{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a : ");
         int a= sc.nextInt();
         System.out.println("enter b : ");
         int b=sc.nextInt();
         System.out.println("enter operator : ");
         char operator=sc.next().charAt(0);
         switch(operator){
             case '+': System.out.println(a+b);
                 break;
             case '-': System.out.println(a-b);
                 break;
             case '*' : System.out.println(a*b);
                  break;
             case '/' :System.out.println(a/b);
                 break;
             case '%' :System.out.println(a%b);
                 break;
             default  :System.out.println("wrong operator");
         }

     }
 }*/

