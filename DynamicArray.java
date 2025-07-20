import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


//a dynamic array is a data structure that can automatically adjust its size during runtime
//an ArrayList uses a regular Java array to store its elements. When the underlying array reaches its capacity and more elements need to be added, a new, larger array is created (typically 1.5 times the old capacity), and all existing elements are copied from the old array to the new one.
//Fast Lookups (O(1))
//Constant Time Appends (O(1) average)
//Linear Time Inserts/Deletes in Middle (O(n))


 class DynamicArrayCreate{
     // fields
    private int [] arr;
    private int count;


    //constructor
    public DynamicArrayCreate(int size){
        arr = new int [size];

    }

    //method to print array
    public void printArray(){
        for(int i:arr){
            System.out.print( i +" ");
        }
    }

    //insert elements
    public void insert(int element ){
        if(arr.length == count ){
            int[] newArray = new int[2*count];
            for(int i=0;i<count;i++){
                newArray[i]=arr[i];
            }
            arr=newArray;
        }
        arr[count++]=element;
    }

}


public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int [] staticArray1 = {-1,2,3,4,5};
        int [] staticArray2 = new int [5];
        List<Integer> dynamicArray = new ArrayList<>();
        for(int i=0 ;i<5;i++){
            staticArray2[i]=in.nextInt();
        }
        System.out.println("Static Array 2 "+ Arrays.toString(staticArray2));
        dynamicArray.add(23);
        dynamicArray.add(24);
        dynamicArray.add(25);

        System.out.println("Dynamic Array :" + dynamicArray);

        // customized dynamic array

        DynamicArrayCreate arr = new DynamicArrayCreate(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);

        // more element will be insert then dynamically allocate
        arr.insert(4);
        arr.insert(5);

        // print the array
        System.out.println("Customized array printed ");
        arr.printArray();
    }

}



