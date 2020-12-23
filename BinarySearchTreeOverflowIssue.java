package binarysearchtree;

//Identify the possible solutions, and fix for the hidden integer overflow bug issue
public class BinarySearchTreeOverflowIssue {

	public static int binarySearch(int[] arr, int x) {
		int minindex = 0;
		int maxindex = arr.length-1;
		
		while (minindex <= maxindex) {
			//sol1: arrayindexoutof bounds exception, if minindex and maxindex are extreme integer values
			//int midindex = (minindex + maxindex)/2;
			
			//sol2: minindex + (maxindex-minindex)/2
			//sol2 arth expression is same as sol1, but this helps to avoid integer overflow issue, bcoz we are subtracting it 
			//int midindex = minindex + (maxindex-minindex)/2;
			
			//sol3: logical shift operator, is used to convert -ve value to +ve value by simply shifting all the digits by one place 
			//For ex: sum of the min and max indexes become negative value
			//For instance: -5 => 0101 => invert => 1010 => 1'scomplement => 1011 => logical shift => 0101 (which is +ve 5)
			int midindex = (minindex + maxindex) >>> 1;
			
			if(arr[midindex] == x) {
				return midindex;
			}
			else if(x < arr[midindex]) {
				maxindex = midindex-1;		
			}
			else {
				minindex = midindex+1;
			}			
		}
		
		return -1;		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i=0;i< arr.length; ++i) {
			arr[i] =i+1;
		}
		System.out.println(binarySearch(arr, 10));
	}

}
