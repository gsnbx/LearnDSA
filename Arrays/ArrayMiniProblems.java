import java.util.*;
class ArrayMiniProblems{
    public static void main(String args[]){
        int arr[] = {12, 48, 10 ,30};

        System.out.println(FindMax(arr));
        
        System.out.println(Arrays.toString(sumavg(arr)));
        
        System.out.println(Arrays.toString(reverseArray(arr)));
        
        System.out.println(Arrays.toString(countOddEven(arr)));
        
        System.out.println(searchElement(arr, 10));
        
    }
    
    //Search an element in array
    public static int searchElement(int arr[], int key){
        int pos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                pos = i;
            }
        }
        return pos;
    }
    
    //Count Even and Odd numbers in an array
    public static int[] countOddEven(int arr[]){
        int odd = 0, even = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0)
                even++;
            else 
                odd++;
        }
        int[] count = {odd, even};
        return count;
    }
    
    //Find largest element in an array
    public static int FindMax(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    
    //Find sum and average of an array
    public static int[] sumavg(int arr[]){
        int[] res = new int[2];
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        res[0] = sum;
        res[1] = sum/arr.length;
        return res;
    }
    
    //Reverse an array
    public static int[] reverseArray(int arr[]){
        int reversed[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            reversed[arr.length-i-1]= arr[i];
        }
        return reversed;
    }
}