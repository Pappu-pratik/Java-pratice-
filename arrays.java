/*
public class arrays {
    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]) {
//    int marks[]=new int[50]; //telling size of array
//
//    int numbers[]={1,2,3}; //directly declare element of array

        int marks[] = {90, 91, 92};
        update(marks);

        //print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
*/

/*public class arrays {
    public static void update(int marks[]){
        for (int i=0; i < marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={95,96,97};
        update(marks);

        //print our marks
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
}*/

// linear search
/*
public class arrays {
    public static int linearSearch(int numbers[],int key) {

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args []){
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index = linearSearch(numbers,key);
        if (index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at :" +index);
        }

    }
}*/

// largest number
/*
import java.util.*;
public class arrays {
    public static int getLargest(int numbers[]){
      int largest=Integer.MIN_VALUE;
      int smallst = Integer.MAX_VALUE;

      for (int i=0; i<numbers.length; i++){

          if (largest < numbers[i]){
              largest = numbers[i];
          }
          if (smallst > numbers[i]){
              smallst = numbers[i];
          }

      }
      System.out.println("Smallest value : "+ smallst);
      return largest;
    }
    public static void main(String args[]){
        int numbers[]={2,3,6,4,5};
        System.out.println("largest number :" + getLargest(numbers));
    }
}*/

// binary search
/*
import java.util.*;
public class arrays {
    public static int binarySearch(int numbers[], int key) {
        int start =0, end=numbers.length-1;

        while (start <= end){
            int mid = (start + end)/2;

            //compare
            if (numbers[mid]==key){
                return mid;

            }
            if (numbers[mid]<key) { //right
                start = mid + 1;
            }else{  //left
                mid = end-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 3, 6, 4, 5};
        int key = 6;
        System.out.println("key is at :" +binarySearch(numbers,key));
    }
}
*/

//reverse number
/*
public class arrays {
    public static void reverseArray(int numbers[]) {
      int first=0, last=numbers.length-1;
      while (first < last){
          //swap
          int temp =numbers[last];
          numbers[last]=numbers[first];
          numbers[first]=temp;
          first++;
          last--;
      }

    }
    public static void main(String args[]) {
        int numbers[]={1,4,6,8,10};

        reverseArray(numbers);

        //print array
        for (int i= 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}*/

// pairs in array
/* public class arrays {
     public static void pairsArray(int numbers[]){
         int totPairs =0;
         for (int i =0; i<numbers.length; i++){
             int current = numbers[i]; //2,4,6,8,10

             for (int j= i+1; j<numbers.length; j++){
                 System.out.print("("+current+" "+numbers[j] +")");
             totPairs++;
             }
             System.out.println( );
         }
         System.out.println("total pairs "+totPairs);
     }
     public static void main(String args[]){
         int numbers[]={2,4,6,8,10};
         pairsArray(numbers);
     }
}*/

// sub arrays
/* public class arrays {
    public static void subArray(int numbers[]) {
        int tos = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i; //2,4,6,8,10

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    //print
                    System.out.print("["+ numbers[k]+"]" + " "); //Sub arrays

                }
                tos++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tos);
    }
        public static void main (String args[]){
            int numbers[] = {2, 4, 6, 8, 10};
            subArray(numbers);
        }
    }*/

// max sub arrays sum
/*
public class arrays {
    public static void subArray(int numbers[]) {
        int tos = 0;
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i; //2,4,6,8,10

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum=0;

                for (int k = start; k <= end; k++) {
                    //print sub array sum
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);

                if (maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println( "max sum "+ maxSum);
    }
    public static void main (String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        subArray(numbers);
    }
}
*/

// trap rainwater
/*import java.util.*;
public class arrays {
    public static int trappedRainwater(int height[]){
        //to calculate left max boundary - array
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];

        for (int i=1; i<height.length; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        //to calculate right max boundary - array

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];

        for (int i=height.length-2; i>=0; i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater=0;
        for (int i=0; i<height.length; i++){
            //waterLevel =min(left max ,right max)
            int waterLevel= Math.min(leftMax[i],rightMax[i]);

            //trapped water = water level -height(i)
            trappedWater += waterLevel-height[i];

        }
        return trappedWater;


    }
    public static void  main(String args[]){
        int height[] ={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}*/


//buy & sell price stock
/*public class arrays {
    public static int buyAndSellStock(int prices[]){
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit =0;

        for (int i=0; i<prices.length; i++){

            if (buyPrice < prices[i]){ //profit

                int profit = prices[i] -buyPrice; //today profit
                maxProfit =Math.max(maxProfit , profit);
            }else {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }
}*/


