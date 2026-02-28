import java.math.BigDecimal;
import java.util.Random; // Added for generating a random string

class BuggyBigDecimal {
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        // Mutant code: Adding a dead store
        int unusedVariable = generateRandomInt();

        return bd;
    }

    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}