import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public void unreachableWhileLoop() {
        boolean conditionWhile = true;
        while (conditionWhile) {
            // unreachable code
            System.out.println("This code is unreachable");
            break;
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());

        // calling the unreachable loop
        be.unreachableWhileLoop();
    }
}