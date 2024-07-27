public class day_05_2 {
    private static boolean isNicePT2(String t) {
        boolean inBetween = false;
        boolean doubleletter = false;

        // Check for the first condition: a letter which repeats with exactly one letter between them
        for (int i = 0; i < t.length() - 2; i++) {
            if (t.charAt(i) == t.charAt(i + 2)) {
                inBetween = true;
                break;
            }
        }

        outerLoop:
        for (int j = 0; j < t.length() - 1; j++) {
            String one = t.substring(j, j + 2);
            for (int k = j + 2; k < t.length() - 1; k++) {
                String two = t.substring(k, k + 2);
                if (one.equals(two)) {
                    doubleletter = true;
                    break outerLoop;
                }
            }
        }

        if (inBetween == true && doubleletter == true) {
            v++;
            return true;
        } else { return false;}
    }
}
