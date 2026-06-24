import java.util.Arrays;

class ReverseAnArray {
	public static void main(String args[]) {

		int arr[] = {10,20,30,40,50};
		int rev[] = new int[arr.length];

		for(int i=arr.length-1; i>=0; i--)
			rev[arr.length-i-1] = arr[i];

		System.out.println(Arrays.toString(rev));
	}
}