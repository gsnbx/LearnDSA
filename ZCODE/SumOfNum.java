class SumOfNum{
    public static void main(String args[]){

        System.out.println(sumOfN(10));
        
    }
    public static int sumOfN(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}