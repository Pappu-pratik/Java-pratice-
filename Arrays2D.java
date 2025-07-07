//2d array creation
/*
import java.util.Scanner;

public class Arrays2D {

    public static void main(String args[]){
        int matrix [][]=new int[3][3];
        int n= 3, m=3;

        Scanner sc =new Scanner(System.in);
        for (int i=0; i<n ;i++){
            for (int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<n ;i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
*/

//Spiral Matrix
// some error is found I have to solve it later on
 /*
public class Arrays2D {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol){
            //top
            for (int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] +" ");
            }
            //right
            for (int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] +" ");

            }
            //bottom
            for (int j=endCol-1; j>=startCol; j--){
                if (startRow==endRow){
                    return;
                }
                System.out.print(matrix[endRow][j] +" ");
            }
            //left
            for (int i=endRow-1; i<=startRow+1; i--){
                if (startCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][i] +" ");
            }
            startRow ++;
            startCol ++;
            endRow --;
            endCol --;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        printSpiral(matrix);

    }
}*/

//diagonal sum
