import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while (size > 0) {
            List<Integer> row = new ArrayList<>();
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                int key = iterator.next();
                int freq = map.get(key);

                if (freq >= 1) {
                    row.add(key);
                    map.put(key, freq - 1);
                    size -= 1;
                } else {
                    iterator.remove();
                }
            }

            answer.add(row);
        }

        return answer;
    }
}
