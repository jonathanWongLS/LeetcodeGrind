public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        // Get length of string
        int stringLength = s.length();

        // Initialise two pointers to point to indexes starting from both left and right
        int left = 0, right = stringLength - 1;

        // Imagine halving the string and comparing mirroring characters while looping to the middle of the string
        // Compare the lowercase version of each alphabets and skip any non-alphanumeric characters
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        

        return true;

    }
}
