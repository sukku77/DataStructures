package Trees;

import java.util.Arrays;

public class KthElement {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2,10, 20, 40, 32, 44, 51, 6 };
		Arrays.sort(array);
		int k=4;
		for(int i=0;i <array.length; i++){
			//array[i];
			System.out.println(array[i]);
		}
		System.out.println("kth element is :"+array[k-1]);
	}
	/*public static int find(int [] A, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<A.length;i++){
			pq.offer(A[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}
	public static void main(String[] args) {
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		int k = 4;
		System.out.println("4th smallest element:" + find(A,4));

	}*/

	
}
