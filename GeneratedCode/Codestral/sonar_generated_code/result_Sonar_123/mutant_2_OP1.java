import java.util.*;

class InfiniteLoopBug {
    public int showBug() {
        Random rand = new Random(); // added for creating a random integer
        int deadStore = rand.nextInt(1000); // dead store mutant

        int j = 0;
        while (true) { // Noncompliant; end condition omitted - Bug: Loops should not be infinite
            j++;
            if (j == Integer.MAX_VALUE) {
                break;
            }
        }
        return j;
    }
}