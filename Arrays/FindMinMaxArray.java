class FindMinMaxArray{
    public static void main(String args[]){
        
        int[] arr = { 10,20,30,5,50,40 };
        
        int min=arr[0], max = arr[0];
        
        for(int i=0; i<arr.length; i++){
            
            if(min > arr[i])
                min = arr[i];
            
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
}