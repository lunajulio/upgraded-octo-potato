package easy;

public class Problem7 {
    public boolean isSubsequence(String s, String t) {

        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) == -1) {
                return false;
            }
        }

        return true;
    }
}
