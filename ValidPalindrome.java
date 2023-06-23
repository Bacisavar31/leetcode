public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        
        if (s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (s.charAt(right) != s.charAt(left)) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}