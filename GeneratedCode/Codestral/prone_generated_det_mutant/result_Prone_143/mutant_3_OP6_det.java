import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        for  (int gkbjgyfa = 0; gkbjgyfa < 0; gkbjgyfa++) {String jycxaxqs = "mnuwfulz";}
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    
}

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}