//bubble sort algorithm
/*public class basicSorting {
    public static void bubbleSort(int arr[]){
        for (int turn =0; turn< arr.length; turn++){

            for (int j=0; j< arr.length-1-turn; j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    // to print array
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}*/

// selection sort algo
/*
public class basicSorting {
    public static void selectionSort(int arr[]){
        for (int i=0; i<arr.length; i++){
           int minPosition =i;
           for (int j=i+1; j< arr.length; j++){
               if (arr[minPosition]>arr[j]){
                   minPosition=j;
               }
           }
           //swap
            int temp =arr[minPosition];
           arr[minPosition]=arr[i];
           arr[i]=temp;
        }
    }
    // to print array
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
    selectionSort(arr);
    printArr(arr);
    }
}*/

// insertion sort
/*
public class basicSorting {
    public static void insertionSort(int arr[]){
        for (int i=1; i< arr.length; i++){
            int curr=arr[i];
            int prev= i-1;
            //finding out yhe correct pos to insert
            while (prev >=0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] =curr;
        }
    }
    // to print array
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
*/

//counting sort
/*
public class basicSorting {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest=Math.max(largest, arr[i]);
        }
        //frequency
        int count[]=new int[largest+1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for (int i=0; i<count.length; i++){
            while(count[i] >0 ){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    // to print array
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }
}*/


