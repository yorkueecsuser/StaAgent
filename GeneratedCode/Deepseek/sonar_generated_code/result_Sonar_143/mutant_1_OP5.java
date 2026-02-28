import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());

        int unreachable = 0;
        switch(unreachable) {
            default:
                System.out.println("This switch statement is unreachable.");
                break;
        }
    }

    private boolean getCondition(){
        return false;
    }

    private int getValue(){
        return 0;
    }
}