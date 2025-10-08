import java.util.*;

public class Solution {

    public static int[] twoSumEasy(int[] nums, int target) {
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

    public static int[] twoSumMedium(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1, total = 0;

        while (l < r) {
            total = numbers[l] + numbers[r];

            if (total == target) return new int[]{l, r};
            if (total > target) r--;
            else l++;
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

    public static int binarySearch(int[] nums, int target) {
        int length = nums.length;
        int middle = length / 2, left = 0, right = 0;

        if (target < nums[middle]) {
            right = middle;
        }
        else {
            left = middle;
            right = length - 1;
        }

        for (int i = left; i < right; i++) {
            if (target == nums[i]) return i;
        }

        return -1;
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        for (int i = l; i < r; i++, r--) {
            if (!isAlphaNum(s.charAt(i))) i++;
            if (!isAlphaNum(s.charAt(r))) r--;
            System.out.println(s.charAt(i) +  " | " + s.charAt(r));
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(r))) return false;
        }

        return true;
    }

    private static boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }

        return prefix;
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, res = 0;
        HashMap<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            while (count.get(c) > 1) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }

    public static int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;


    }
}
