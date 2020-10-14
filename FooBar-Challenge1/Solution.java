
public class Solution {
	
	/**********************************************************
	 * Method that returns Solution
	 * 
	 * @param data:
	 * @param n:
	 **********************************************************/
	
	public static int[] solution(int[] data, int n) {
		int i = 0; // Initialize a variable to hold our variable for our while loop
		
		// while i < the array go through
		while (i < data.length) {
			// if the number appears in the array more than n times
			if (appears(data, data[i]) > n) {
				// remove it
				data = remove(data, data[i]);
			} else {
				// the number appears less than n times, move on
				i++;
			}
		}
		return data;
	}
	
	/**********************************************************
	 * Method counts how many times the number appears
	 * 
	 * @param data
	 * @param num
	 **********************************************************/
	
	public static int appears(int[] data, int num) {
		int appears = 0; // Initalize a variable to count the number of appearences
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] == num) { // if the number appears more than once
				// add to appears
				appears++;
			}
		}
		return appears;
	}
	
	/**********************************************************
	 * Method removes a value
	 * 
	 * @param data
	 * @param num
	 **********************************************************/
	
	public static int[] remove(int[] data, int num) {
		int currentLength = data.length - appears(data,num);
        int track = 0; // index tracker
        int[] currentValues = new int[currentLength]; // get the length of the new array

        // go through the original array
        for (int i = 0; i < data.length; i++) {
            // if the current element 
            if (data[i] != num) {
                currentValues[track] = data[i]; // add it to the new array
                track++; //increase the index tracker for the new array
            }
        }
        
        return currentValues; //return the new array
	}
}
