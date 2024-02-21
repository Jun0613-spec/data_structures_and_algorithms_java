package InterpolationSearch;

public class Main {

    public static void main(String[] args) {
        
        // interpolation search =  improvement over binary search best used for "uniformly" distributed data
    	// "guesses" where a target might be based on calculated probe results
    	//	if probe is incorrect, search area is narrowed, and a new probe is calculated
    	
    	//	average case: O(log(log(n)))
    	//	worst case: O(n) [targets increase exponentially]

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    	
    	int index = interpolationSearch(array, 4);
    	
    	if(index != -1) {
    		System.out.println("Element found at index: "+ index);
    	}
    	else {
    		System.out.println("Element not found");
    	}
    }

    private static int interpolationSearch (int[] array, int target) {

		int start = 0;
		int end = array.length - 1;

		while(target >= array[start] && target <= array[end] && start <= end) {

			int probe = start + (end - start) * (target - array[start]) / (array[end] - array[start]);

			System.out.println("probe: " + probe);
			
			if(array[probe] == target) {
				return probe;
			}
			else if(array[probe] < target) {
				start = probe + 1;
			}
			else {
				end = probe -1;
			}
		}
		
        return -1;
    }
    
}
