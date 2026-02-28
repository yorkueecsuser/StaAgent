import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public int unreachableMutant() {
        switch (1) {
            case 0:
                // Mutant code that should make the switch statement unreachable
                break;
            default:
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
        System.out.println(be.unreachableMutant()); // Adding unreachable mutant
    }
}