import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length, leftover = 0;

        for (int i = 0; i < length; i++) {
            leftover = target - nums[i];
            if (map.containsKey(leftover)) {
                return new int[]{map.get(leftover), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }

    public static int romanToInt(String s) {
        int total = 0, length = s.length();

        if (s.isEmpty() || s == null) throw new NullPointerException();

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5, 'X', 10,
                'L', 50,'C', 100,
                'D', 500, 'M', 1000
        );



        for (int i = 0; i < length; i++) {
            int curr, next = 0;

            if (!map.containsKey(s.charAt(i))) throw new IllegalArgumentException();

            curr = map.get(s.charAt(i));
            if (i == length - 1) next = curr;
            if (i < length - 1) next = map.get(s.charAt(i + 1));

            if (curr < next) total -= curr;
            else total += curr;
        }

        return total;
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//
//
//        return ;
//    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        s = s.replaceAll(" ", "").toLowerCase();
        t = t.replaceAll(" ", "").toLowerCase();

        if (s.length() != t.length()) return false;

        for (char cS : s.toCharArray()) {
            map.put(cS, map.getOrDefault(cS, 0) + 1);
        }

        for (char cT : t.toCharArray()) {
            if (!map.containsKey(cT)) return false;
            map.put(cT, map.get(cT) - 1);
            if (map.get(cT) == 0) map.remove(cT);
        }

        return map.isEmpty();
    }
}
