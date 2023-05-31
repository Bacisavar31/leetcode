import java.util.*;

public class ContainsDuplicate {
    
    public static boolean containsDuplicate(int[] numbers){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length ; i++) {
            int number = numbers[i];

            if (set.contains(number)) {
                return true;
            } else {
                set.add(number);
            }
        }

        return false;
    }
}
