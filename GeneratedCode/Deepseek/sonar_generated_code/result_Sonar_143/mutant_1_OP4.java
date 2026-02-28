import java.util.Random;

class BugExample {
    private Random random = new Random();

    // Mutation: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        if (false) {
            r = this.random;
        }
        return r.nextInt(100);
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
    }
}