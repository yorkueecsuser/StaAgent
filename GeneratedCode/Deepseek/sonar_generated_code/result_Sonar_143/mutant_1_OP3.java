import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);

        boolean falseCondition = false;
        if (falseCondition) {
            System.out.println("This statement unreachable due to a mutation.");
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
    }
}