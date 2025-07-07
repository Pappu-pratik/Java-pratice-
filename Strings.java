/*
import java.util.*;
public class Strings {
    public static void printLetter(String full_name){
        for (int i=0; i<full_name.length(); i++){
            System.out.print(full_name.charAt(i)+ " ");
        }
    }
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
        String str ="abcd";
        String str2 =new String("xyz");

        //Strings are immutable(not change in old strings)

        //input string
        Scanner sc = new Scanner(System.in);
        String name;
//        name =sc.next(); //input single word
//        name =sc.nextLine(); //input line
//        System.out.println(name);


        String fullName ="Tony Stark";
        System.out.println(fullName.length()); //in string length is a function

        //concatenation(add multiple string)
        String firstName = "Pratik";
        String lastName = "Singh";
        String full_Name = firstName +" "+lastName;
        System.out.println(full_Name);

        //to print each letter of string
        System.out.println(full_Name.charAt(1)); // use.charAt to print each character

        printLetter(full_Name);
    }
}

*/

//check if a string is palindrome
/*
public class Strings {
    public static boolean isPalindrome(String str){
        for (int i=0; i<str.length()/2; i++){
            int n =str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                //not palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str ="racecar";

        System.out.print(isPalindrome(str));
    }
}*/

//shortest path using direction
/*
public class Strings {
    public static float shortestPath(String path){
        int x=0, y=0;
        for (int i=0; i<path.length(); i++){
            char direction =path.charAt(i);

            //south
            if (direction=='S'){
                y--;
            }
            //north
            else if (direction=='N') {
                y++;
            }
            //west
            else if (direction=='W'){
                x--;
            }
            else {
                x++;
            }
        }
        int X2 =x*x;
        int Y2 =y*y;
        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        String path ="WNEENESENNN";

        System.out.print(shortestPath(path));
    }
}*/

// string compare
/*public class Strings {
    public static void main(String args[]){
        String s1 ="tonny";
        String s2 ="tonny";
        String s3 =new String("tonny");

        if(s1==s2) {
            System.out.println("strings are equal");
        }else {
                System.out.println("strings are not equal");
        }
        if(s1.equals(s3)) { //if we compare created string using new then use .equals
            System.out.println("string are equal");
        }else {
            System.out.println("string are not equal");
        }
    }
}*/

//substring print
/*public class Strings {
    public static String subString(String str,int si,int ei){
        String subStrings = "";
        for (int i=si; i<ei;i++){
            subStrings += str.charAt(i);
        }
        return subStrings;
    }
    public static void main(String args[]){
        String str= "HelloWorld";
//        str.substring(0,5);  // in_build function for substr in java
//        System.out.println(str.substring(0,5));
//        System.out.print(subString(str,0,5));
    }
}*/



