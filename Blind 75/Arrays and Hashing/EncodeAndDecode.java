import java.util.*;

public class EncodeAndDecode {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // For every string in the array, add string length and then the delimitter after that followed by the string
        String returnString = "";
        String encoded = "";
        for (int i = 0; i < strs.size(); i++) {
            encoded = strs.get(i).length() + "#" + strs.get(i);

            // Append all these encoded strings together then return
            returnString += encoded;
            
            encoded = "";
        }
        return returnString;
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // Get the first number (m), skip the delimitter and add the next m characters as a string into an array
        int stringLength = 0;
        List<String> decodedStrings = new ArrayList<>();
        int indexStringEnd = 0;
        String stringElement = "";

        for (int i = 0; i < str.length(); i++) {
            stringLength = Character.getNumericValue(str.charAt(i));
            
            // Skip delimitter
            i += 1;

            // Get characters of the string
            int stringIndexEnd = i + stringLength;
            stringElement = "";
            while (i < stringIndexEnd) {
                i++;
                stringElement += str.charAt(i);
            }

            // Add string to list
            decodedStrings.add(stringElement);
        }
        return decodedStrings;
    }
}
