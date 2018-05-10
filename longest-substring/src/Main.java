import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.printf("%s: %d", s, lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = 1;
        Set<Character> substring = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            if (substring.contains(s.charAt(i))) {
                if (len < substring.size()) {
                    len = substring.size();
                }
                substring.clear();
                substring.add(s.charAt(i));
            } else {
                substring.add(s.charAt(i));
            }
        }

        if (len < substring.size()) {
            len = substring.size();
        }

        return len;
    }
}
