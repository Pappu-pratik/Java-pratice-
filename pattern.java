// print star pattern
/*public class pattern {
    public static void main(String args[]){
        for (int line=1; line<=4; line++){
            // one line
            for (int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/*
public class pattern {
    public static void main(String args[]){
        for(int line=1; line<=10; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 */
// print inverted star pattern
/*public class pattern {
    public static void main(String args[]){
        int n=4;
        for (int line=1; line<=n; line++){
            // one line
            for (int star=1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//hollow rectangular pattern
/*public class pattern {
    public static void hollowPattern(int rows, int cols ){
        //outer loop
        for (int i=1; i<=rows; i++){
            //inner loop
            for (int j=1; j<=cols; j++){
                //for boundary cell
                if(i == 1 || i==rows || j==1 || j==cols){

                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollowPattern(5,8);
    }
}*/

// Inverted And Rotated Half Pyramid
/*
public class pattern {
    public static void halfPyramid(int n){
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=n-1; j++){
                //for space
                System.out.print(" ");
            }
            //for star
            for (int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        halfPyramid(5);
    }
}*/

//Inverted And Half Pyramid  with no
/*
public class pattern {
    public static void halfPyramidWithNo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i+ 1; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        halfPyramidWithNo(5);
    }
}*/

// floyd triangle pattern
/*
public class pattern {
    public static void floydTriangle() {
        int n=5;
        int counter =1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(counter+" ");
                counter++;

            }

            System.out.println();
        }

    }
    public static void main(String args[]){
        floydTriangle();
    }
}*/

//01 triangle
/*
public class pattern {
    public static void triangle01(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               if ((i+j)%2==0){
                   System.out.print("1 ");
               }
               else {
                   System.out.print("0 ");
               }
            }

            System.out.println();
        }

    }
    public static void main(String args[]){
        triangle01(5);
    }
}
*/

//butterfly pattern

//butterfly pattern
/*public class pattern {
    public static void butterfly(int n) {
        for (int i=1; i<=n; i++){ //outer loop

            //star-1
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            //spaces 2*(n-i)
            for (int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            //star
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            //star-1
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            //spaces 2*(n-i)
            for (int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            //star
            for (int j=1; j<=i; j++){
                System.out.print("**");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        butterfly(5);
    }
}*/

//solid rhombus pattern
/*public class pattern{
    public static void solidRhombus(int n){
        for (int i=1; i<=n; i++){
            //for space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for star
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            //for next line
            System.out.println();
        }

    }

    public static void main(String args[]){
        solidRhombus(5);
    }
}*/

// hollow rhombus
/*
public class pattern{
    public static void hollowRhombus(int n){
        for (int i=1; i<=n; i++){
            //for space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

            //for next line
            System.out.println();
        }

    }

    public static void main(String args[]){
        hollowRhombus(5);
    }
}*/

//diamond pattern
/*public class pattern {
    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");

                System.out.println();
            }
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void mnain(String args[]){
        diamond(5);
    }
}*/

//diamond pattern
/*
public class pattern {
    public static void diamond(int n){
        for (int i = 1; i <= n; i++){
            //for spaces
            for (int j = 1; j <= n -i; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n; i >=1; i--){
            //for spaces
            for (int j = 1; j <= n -i; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
diamond(5);
    }
}*/


// number pyramid
/*public class pattern {
    public static void numberPyramid(int n){
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for number
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");

            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        numberPyramid(5);
    }
}*/

//palindromic pattern with number
/*
public class pattern {
    public static void palindrome(int n){
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for descending number
            for (int j = i; j >=1; j--) {
                System.out.print(j);

            }
            //for descending number
            for (int j = 2; j <=i; j++) {
                System.out.print(j);

            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        palindrome(5);
    }
}*/


