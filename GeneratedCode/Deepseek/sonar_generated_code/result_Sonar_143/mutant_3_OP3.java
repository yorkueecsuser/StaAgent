import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        if (false) {
            return r.nextInt(100);
        }
        return 0;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
    }
}