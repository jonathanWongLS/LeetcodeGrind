import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // Initialise hashmap that stores element-frequency values
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Initialise the arraylist that keeps the top K elements
        int[] topKElements = new int[k];

        // Add the elements in the array and store the frequency of each element as value
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        // In a 2D vector, store data in the form of frequency-element
        List<List<Integer>> frequencyList = new ArrayList<>();

        // Create N+1 elements in frequencyList and initialise ArrayList in each element
        for(int i = 0; i < nums.length + 1; i++) {
            frequencyList.add(new ArrayList<>());
        }
    
        for (int element: hashMap.keySet()) {
            frequencyList.get(hashMap.get(element)).add(element);
        }
        
        // The count to keep track of how many elements we have outputted
        int count = 0; 

        // In ArrayLists indexed by frequency in the hashMap, add the elements as value 
        for (int i = frequencyList.size()-1; i >= 0; i-- ) {

            if (frequencyList.get(i).size() > 1) {
                Collections.sort(
                    frequencyList.get(i),
                    Collections.reverseOrder()
                );
            }

            for (int j = 0; j < frequencyList.get(i).size(); j++) {
                topKElements[count] = frequencyList.get(i).get(j);
                count++;
                if (count == k) { 
                    return topKElements;
                }
            }

        }

        return topKElements;
    }
}
