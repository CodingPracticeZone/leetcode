
public class Main {

    public static void main(String[] args) {
        String s = "ababcbb";
        System.out.printf("%s: %d", s, lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = 1;

        for(int i = 0; i < s.length(); i++) {
            boolean repeat = false;
            for(int j = i + 1; j < s.length(); j++) {
                for(int k = j - 1; k >= i; k--) {
                    if(s.charAt(j) == s.charAt(k)) {
                        repeat = true;
                        break;
                    }
                }
                if(repeat) {
                    i = j;
                    break;
                } else if(j - i + 1 > len) {
                    len = j - i + 1;
                }
            }
        }

        return len;
    }
}
