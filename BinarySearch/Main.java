package BinarySearch;

public class Main {

    public static void main(String[] args) {
        // binary search = Search algorithm that finds the position
        //       of a target value within a sorted array.
        //       Half of the array is eliminated during each "step"

        // Time complexity: O(log n)

        int array[] = new int[1000000];
		int target = 777777;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		//int index = Arrays.binarySearch(array, target);
		int index = binarySearch(array, target);
		
		if(index == -1) {
			System.out.println(target + " not found");
		}
		else {
			System.out.println("Element found at: " + index);
		}
    }

    private static int binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            System.out.println("middle: " + array[mid]);

            if(array[mid] == target) {
                return mid;
            } else if(array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
}
