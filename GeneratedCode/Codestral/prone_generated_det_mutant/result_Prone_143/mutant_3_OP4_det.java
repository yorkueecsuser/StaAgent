import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        if (true && false && false && true && true && true && false && false && false && false && false) {short jgugqubb = 3617;}else{short ejnttjxt = -2313;}
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    
}

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}