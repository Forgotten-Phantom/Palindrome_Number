public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else if (x > 0 && x < 10)
            return true;
        else {
            String[] m = Integer.toString(x).split("");
            int endNumber = m.length - 1;

            for (int i = 0; i < m.length / 2; i++) {
                if (Integer.parseInt(m[i]) != Integer.parseInt(m[endNumber]))
                    return false;

                endNumber--;
            }
        }

        return true;
    }
}
