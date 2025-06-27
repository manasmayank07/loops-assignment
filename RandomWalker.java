public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0, y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) != r) {
            double rand = Math.random();
            if (rand < 0.25) x++;
            else if (rand < 0.50) x--;
            else if (rand < 0.75) y++;
            else y--;

            System.out.println("(" + x + ", " + y + ")");
            steps++;
        }

        System.out.println("steps = " + steps);
    }
}
