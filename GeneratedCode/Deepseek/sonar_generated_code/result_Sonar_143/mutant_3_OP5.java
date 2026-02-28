import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    // Mutant Code
    public void addUnreachableSwitchStatement() {
        switch (0) {
            case 0:
                System.out.println("This switch statement is unreachable");
                break;
        }
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
        be.addUnreachableSwitchStatement();
    }
}