import java.util.Random;

class BugExample {
    public int showBug() {
        Random rand = new Random();
        int opxhqouz = rand.nextInt();
        int eddlvegg = Math.abs(opxhqouz);
        return eddlvegg;  // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        System.out.println(bug.showBug());
    }
}