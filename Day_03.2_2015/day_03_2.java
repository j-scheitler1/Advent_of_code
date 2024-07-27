import java.util.HashSet;
import java.util.Set;

public class SantaAndRoboSanta {


    static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Position position = (Position) o;

            if (x != position.x) return false;
            return y == position.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }

    public static void main(String[] args) {
        String directions = "^v^v^v^v^v";  // Replace with your input


        Position santa = new Position(0, 0);
        Position roboSanta = new Position(0, 0);


        Set<Position> visitedHouses = new HashSet<>();
        visitedHouses.add(new Position(0, 0));


        for (int i = 0; i < directions.length(); i++) {
            Position current = (i % 2 == 0) ? santa : roboSanta;
            switch (directions.charAt(i)) {
                case '^': current.y += 1; break;
                case 'v': current.y -= 1; break;
                case '<': current.x -= 1; break;
                case '>': current.x += 1; break;
            }
            visitedHouses.add(new Position(current.x, current.y));  // Add the new position to the set
        }

        System.out.println("Number of houses that receive at least one present: " + visitedHouses.size());
    }
}

