import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    // Mutant Code: Unreachable if-else statement
    public int showMutantBug() {
        boolean condition = false;
        if (condition) {
            return random.nextInt(100);
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
        System.out.println(be.showMutantBug());
    }
}