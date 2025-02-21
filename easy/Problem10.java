package easy;

public class Problem10 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s|[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
