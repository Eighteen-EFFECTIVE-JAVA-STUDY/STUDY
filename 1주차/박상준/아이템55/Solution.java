package 아이템55;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = Arrays.stream(strs)
                .collect(Collectors.groupingBy(Solution::alphabetize, Collectors.toList()));
        
        return List.copyOf(anagrams.values());
    }
    
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}