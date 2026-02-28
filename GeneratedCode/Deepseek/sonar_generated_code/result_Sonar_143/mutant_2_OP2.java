import java.util.Random;

class BugExample {
    private Random random = new Random();

    public int showBug() {
        Random r = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
    }
}