/**
 * @author Amir Offir
 * 
 * Question 1 answers:
 * Section A: the true claims are -  3,5.
 */
public class Ex14 {
	/**
	 * A method who checks if a given value is found in the given array.
	 * Time complexity = O(n). loop who runs at the worst case n times(the given array length).
	 * Space complexity = O(1). The number of memory cells is constant and does not depend on the input.
	 * @param m a given array
	 * @param val a given value
	 * @return true if the value is found, false otherwise
	 */
	public static boolean findValWhat (int [][] m, int val) { 
		int n = m.length;
		int i = 0;
		int j = n-1;
		// Check if given value is between the square array boundaries.
		//top left value is the the minimum and bottom right is the maximum. 
		if (m [i][i] > val || m [j][j] < val) 
			return false;
		while (i < n && j >= 0) { // Search in the array from top right towards the bottom left by comparing the elements to the given value.
			if (m[i][j] > val) 
				j--;
			else if (m[i][j] < val) 
				i++;
			else 
				return true;
		}
		return false;
	}
	
	/**
	 * A method who checks if a given value is found in the given array.
	 * Time complexity = O(n). loop who runs at the worst case n times(the given array length).
	 * Space complexity = O(1). The number of memory cells is constant and does not depend on the input.
	 * @param m a given array
	 * @param val a given value
	 * @return true if the value is found, false otherwise
	 */
	public static boolean findValTest (int [][] m, int val) { 
		int n = m.length;
		int i = 0;
		int j = 0;
		while (j < n) { // Search in the array from top left towards the bottom right by comparing the elements to the given value.
			if (m[i][j] < val) { 
				i++;
				if (i == n) { // if no element is found greater than the value along the column, go to first element of the next column.
					i = 0;
					j++;
				}
			}
			else if (m[i][j] > val) {
				i = 0;
				j++;
			}
			else 
				return true;
		}
		return false;
	}
	
	/**
	 * A method who returns the number of sub-arrays which arranged in ascending order.
	 * @param a a given array
	 * @return count - the number of sub-arrays which arranged in ascending order
	 */
	public static int strictlyIncreasing (int[] a) {
		int n = a.length;
		int j = 0;
		int count = 0;
		for (int i = n-1; i >= 1; i--) { 
			if (a[i] > a[i-1]) { 
				j++; // count every strictly increasing sub-array that found
				count += j; // add to the overall counter of how many times it happened in the array
			}
			else  
				j = 0; // resets the temporary count when sub-array isn't strictly increasing
		} 
		return count;
	} 

	/**
	 * A method that returns the length of the maximum sub-array that is a flat sequence.
	 * @param arr a given array.
	 * @return the longest flat sequence.
	 */
	public static int longestFlatSequence (int[] arr) {
		return longestFlatSequence(arr,0,1,1); // call for overloading method which allows to go over the array from start to end.
	}

	// An overloading method that returns the length of the maximum sub-array that is a flat sequence.
	private static int longestFlatSequence (int[] arr, int index, int index2, int longest){
		if (arr.length == 0)
			return 0;
		if (arr.length == 1)
			return 1;
		if (index == index2) { // breakpoint for the search and the recursion. the whole array is checked.
			return longest;
		}
		if (index2 == arr.length) { 
			index2 = index+1;
			return longestFlatSequence (arr, index+1, index2,longest); // promote the recursion if the the second index has reached the array end.
		}	

		if (isFlat(arr,index,index2)) {
			longest = Math.max(lengthFlat(arr, index, index2),longest);
			return  longestFlatSequence (arr, index, index2+1 ,longest); // promote the recursion if the sub-array is flat.
		}
		if(!isFlat(arr,index,index2) && index2 - index !=1) {
			index2 = index+2;
			return longestFlatSequence (arr, index+1, index2,longest); // promote the recursion if the sub-array isn't flat and the indexes aren't following.
		}
		return longestFlatSequence (arr, index+1, index2+1 ,longest); // promote the recursion if the sub-array isn't flat and the indexes are following.
	}
	
	/**
	 * A method which calculate the length of given sequence.
	 * @param arr a given array
	 * @param index a given index
	 * @param index2 a given index
	 * @return the flat sequence length
	 */
	public static int lengthFlat(int[] arr, int index, int index2) {	
		return (index2 - index) + 1;
	}

	// Check if the index who tested isn't one of the first two in the array.
	// if isn't, it allows to perform tests on him.
	private static boolean isValid(int index) {
		if (index >= 2)
			return true;
		return false;
	}

	// A method who returns true if two different indexes are belongs to the same flat sequence, false otherwise.
	private static boolean isFlat(int[] arr, int index, int index2) {
		if (Math.abs(arr[index2] - arr[index]) <= 1) {
			if (index2 - index == 1)
				return true;
			if (isValid(index2)) { // if the index is valid, perform tests by comparing the value to those of the two values preceding him.
				if(arr[index2] == arr[index2-1] || arr[index2] == arr[index2-2])
					return true;

				if(arr[index2] - arr[index2-2] == arr[index2] - arr[index2-1] && Math.abs(arr[index2] - arr[index2-2]) < 2)
					return true;
			}
		}
		return false;
	}
	
	/**
	 * A method who returns the maximum value path in a given 2d array, starting from the top left cell.
	 * the path should not pass through cell contains the value (-1).
	 * @param mat a given 2d array.
	 * @return the maximum value path.
	 */
	public static int findMaximum(int[][] mat) {
		return  findMaximum(mat, 0, 0, 0); // call for overloading method which allows to go over the 2d array from the start point.
	}
	
	//An overloading method who returns the maximum value path in a given 2d array, starting from the top left cell.
	private static int findMaximum(int[][] mat, int row, int col, int count) {
		if (mat[0][0] == -1) { 
			return -1;
		}
		if (!isValid(mat, row, col))
			return 0;
		if (mat == null || mat.length == 0) 
			return 0;

		int tmp = mat[row][col]; // hold the value in a given cell. allows to perform temporary changes in the array.
		mat[row][col] = 2; // mark the cell as visited. prevents return to the cell again.

		if (row % 2 == 0) { // promote the recursion when the row is even and decide which step will better increase the points of the path.
			count =	tmp + Math.max(findMaximum(mat, row, col+1, count), findMaximum(mat, row+1, col, count)); 
		}
		if (row % 2 == 1) { // promote the recursion when the row is odd and decide which step will better increase the points of the path.
			count =  tmp + Math.max(findMaximum(mat, row, col-1, count), findMaximum(mat, row+1, col, count)); 
		}
		mat[row][col] = tmp; // before returning the maximum path, returning to each cell his original value.
		return count;
	}

	// Method who checks if a cell is valid to step into (boundaries, -1 or visited before). 
	private static boolean isValid(int[][] mat, int row, int col) {
		if (row < 0 || row == mat.length)
			return false;
		if (col < 0 || col == mat[0].length)
			return false;
		if (mat[row][col] == -1)
			return false;
		if (mat[row][col] == 2)
			return false;
		else 
			return true;
	}
}
