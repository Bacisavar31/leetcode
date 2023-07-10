import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {


        if (strs.length == 0) {
            List<List<String>> result = new ArrayList<>();

            List<String> add = new ArrayList<>();
            add.add(0, "");

            result.add(0, add);
            return result;
        }
        
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();


        for(int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> innermap = new HashMap<>();
            
            // word map
            for(int j = 0; j < strs[i].length(); j++) {
                if(innermap.containsKey(strs[i].charAt(j))) {
                    innermap.replace(strs[i].charAt(j), innermap.get(strs[i].charAt(j)) + 1);
                } else {
                    innermap.put(strs[i].charAt(j), 1);
                }
            }


            if (map.containsKey(innermap)) {

                map.get(innermap).add(strs[i]);

            } else {

                ArrayList<String> indexList = new ArrayList<>();
                indexList.add(strs[i]);

                map.put(innermap, indexList);
            }         
        }

        // Map is full at this point

        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> element : map.values()) {
            result.add(element);
        }

        return result;
    }
}
