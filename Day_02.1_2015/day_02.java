import java.io.*;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class day_02 {

    public static File myFile = new File("./resources/day_02.txt");


    /**
     * Find the surdace area of the box, which is
     *  SA = (2 * l * w) + (2 * w * h) + (2 * h * l)
     *
     *  ex) 2x3x4 = (2 * 6)
     */
    public static void main(String[] args) {
        BufferedReader reader;
        int l = 0;
        int w = 0;
        int h = 0;
        int side_01 = 0;
        int side_02 = 0;
        int side_03 = 0;
        int ans = 0;
        int smallest_side = 0;

        try {
                List<String> allLines = Files.readAllLines(Paths.get("./resources/day_02.txt"));

                for (String line: allLines) {
                    String[] dimArray = line.split("x");

                    l = Integer.parseInt(dimArray[0]);
                    w = Integer.parseInt(dimArray[1]);
                    h = Integer.parseInt(dimArray[2]);

                    side_01 = l * w;
                    side_02 = l * h;
                    side_03 = w * h;

                    smallest_side = Math.min(Math.min(side_01, side_02), side_03);

                    int surfaceArea = 2*side_01 + 2*side_02 + 2*side_03;
                    ans += surfaceArea + smallest_side;
                }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(ans);
    }
}
