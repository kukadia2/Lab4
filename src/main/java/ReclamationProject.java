/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * A class that teaches you how to write clean code.
 * @author Isha Kukadia
 */
public class ReclamationProject {
    /**
     * @param a
     * a the first String
     * @param b
     * b the second String
     * @return r
     */
    static String doIt(final String a, final String b) {
        if (a.length() > b.length()) {
            String c = a;
        }
        String r = ""; // I love the ternary operator!
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            } // Ah yeah
        }
        return r;
     }

    /**
     * Testing outputs.
     * @param args
     * args the args
     */
    public static void main(final String[] args) {
        String one = "testing";
        String two = "a string";
        System.out.println(doIt(one, two));
    }

}
