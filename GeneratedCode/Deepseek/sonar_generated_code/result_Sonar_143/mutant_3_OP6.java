import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    // Unreachable for loop mutation
    public int mutantShowBug() {
        Random r = new Random();
        for (int i = 0; false; i++) {
            // Unreachable code
            i++;
        }
        return r.nextInt(100);
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
        System.out.println(be.mutantShowBug());
    }
}