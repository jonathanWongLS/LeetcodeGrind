import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Create new HashMap  
        HashMap<String, List<String>> mapOfAnagrams = new HashMap<>();
        List<List<String>> listsOfListsOfAnagrams = new ArrayList<>();

        // 2. For every string, sort each string.
        //    If sorted string exists in map, only add the unsorted string to the ArrayList of strings using sorted string as key 
        //    Otherwise, add the sorted string as a key, add the unsorted string into the arraylist 
        for (int i = 0; i < strs.length; i++) {
            char[] anagramCharacters = strs[i].toCharArray();
            Arrays.sort(anagramCharacters);
            String sortedString = String.valueOf(anagramCharacters);
            
            if (mapOfAnagrams.get(sortedString) != null) {
                List<String> listOfMatchingStrings = mapOfAnagrams.get(sortedString);
                listOfMatchingStrings.add(strs[i]);
            } 
            else {
                List<String> listOfMatchingStrings = new ArrayList<>();
                listOfMatchingStrings.add(strs[i]);
                mapOfAnagrams.put(sortedString, listOfMatchingStrings);
            }

        }
        
        // 3. For every set in the HashMap, append each ArrayList into a new ArrayList
        for (Map.Entry<String, List<String>> set : mapOfAnagrams.entrySet()) {
            // Printing all elements of a Map
            listsOfListsOfAnagrams.add(set.getValue());
        }

        // 4. Return that new ArrayList
        return listsOfListsOfAnagrams;

    }
}
