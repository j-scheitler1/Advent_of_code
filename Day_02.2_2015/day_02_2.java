import java.io.*;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class day_02_2 {

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


                smallest_side = Math.min(Math.min(l, w), h);
                int second_smallest = 0;

                if(smallest_side == l) {
                    second_smallest = Math.min(w, h);
                } else if (smallest_side == w) {
                    second_smallest = Math.min(l, h);
                } else { second_smallest = Math.min(l, w);}

                int surfaceArea = l*w*h;
                int ribbonLength = 2*smallest_side + 2*second_smallest;
                ans += surfaceArea + ribbonLength;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(ans);
    }
}
