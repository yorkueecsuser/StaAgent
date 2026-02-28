import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public int showMutantBug() {
        int unreachableLoop = 0;
        for (int i = 0; i < 0; i++) {
            unreachableLoop++;
        }
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
        System.out.println(be.showMutantBug());
    }
}