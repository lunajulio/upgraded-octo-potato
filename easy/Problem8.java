package easy;

public class Problem8 {
    public boolean isSubsequence2(String s, String t) {

        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean inStr = false;
            while (k < t.length()) {
                if (t.charAt(k) == s.charAt(i)) {
                    inStr = true;
                    k++;
                    break;
                }
                k++;
            }
            if (inStr == false) {
                return false;
            }

        }
        return true;
    }
}
