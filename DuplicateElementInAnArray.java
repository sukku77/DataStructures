package array;

//Print the duplicate element in an unsorted array[n] of elements 1 to n-1 (for ex: n= 10 , arr elements must be 1 to 9 only)
public class DuplicateElementInAnArray {

	public static int findDuplicateElement(int[] arr){
		//sol1: Iterate 2 for loops, outer for loop with i index and inner for loop to iterate i+1 to n-1 elements
		//TC:O(n**2)
		
		//sol2: sort array , while iterate check to the next value, if same return duplicate element
		//TC:nlogn
		
		/*sol3: Take an another boolean array of same size, default value as false, iterate for loop, when visited each index of arr, mark the index of the second array to true
		note: index of the second arr should be value of the arr[index]
		By this, when we visited a duplicate element in arr,then we try to mark the value of the index to true again, but which is already turned to true. So this element is dupliate and return it
		Note:This sol3 Space complexity is O(n). Inorder to reduce the space complexity to O(1) try sol4*/		
			/*boolean[] temp = new boolean[arr.length];
			for(int i=0;i<temp.length;i++) {			
				if(!temp[arr[i]-1]) {
					temp[arr[i]-1] = true;
				}
				else {
					return arr[i];
				}
			}*/
			
		//sol3: If arr is mutable positive integer array, use itself to update the elements with visited elements to negate value itself
		for(int i=0;i<arr.length;i++) {
			int temp = Math.abs(arr[i]);
			if(arr[temp-1] <	 0) {
				return temp;
			}
			arr[temp-1] *=  -1;
		}
		
		return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		int[] arr = {5,3,1,9,5,4,6,1,8};
		System.out.println(findDuplicateElement(arr));
	}

}
