import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class day_05 {

    public static File myFile = new File("./resources/day_05.txt");
    public Scanner scrn = new Scanner(System.in);

        public static void main(String[] args) {
            try {

                List<String> allLines = Files.readAllLines(Path.of("./resources/day_05.txt"));
                int perfectStringCount = 0;

                for (String s : allLines) {
//                    System.out.println(s);
                    char[] tempArray = s.toCharArray();
                    System.out.println(tempArray);

                    boolean first = notContain(tempArray);
                    boolean second = doubleLetter(tempArray);
                    boolean third = threeVowels(tempArray);

                    if (first == false && second == true && third == true) {
                        perfectStringCount++;
                    }

                }

            System.out.print(perfectStringCount);

            } catch (IOException e) {e.printStackTrace();}

        }

        private static boolean threeVowels (char[] s) {

            boolean a = false;
            boolean e = false;
            boolean i = false;
            boolean o = false;
            boolean u = false;
            int vowelCount = 0;

            for (char c : s) {
                switch (c) {
                    case 'a':
                        a = true;
                        break;
                    case 'e':
                        e = true;
                        break;
                    case 'i':
                        i = true;
                        break;
                    case 'o':
                        o = true;
                        break;
                    case 'u':
                        u = true;
                        break;
                }

            }

                if(a = true) {
                    vowelCount++;
                }
                if(e = true) {
                    vowelCount++;
                }
                if(i = true) {
                    vowelCount++;
                }
                if(o = true) {
                    vowelCount++;
                }
                if(u = true) {
                    vowelCount++;
                }



            if (vowelCount >= 3) {
                return true;
            } else { return false;}

        }

        private static boolean doubleLetter (char[] s) {

            for (int i = 0; i < s.length - 1; i++) {
                char temp = s[i];

                if (temp == s[i + 1]) {
                    return true;
                }
            }

            return false;
        }

        private static boolean notContain (char[] s) {

            for (int i = 0; i < s.length - 1; i++) {
                char temp = s[i];

                if (temp == 'a' && s[i + 1] == 'b') {
                    return true;
                }
                if (temp == 'c' && s[i + 1] == 'd') {
                    return true;
                }
                if (temp == 'p' && s[i + 1] == 'q') {
                    return true;
                }
                if (temp == 'x' && s[i + 1] == 'y') {
                    return true;
                }
            }

            return false;
        }

}


