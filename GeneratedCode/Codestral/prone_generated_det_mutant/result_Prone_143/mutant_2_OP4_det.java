import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        if (true && false && true && false && false && false && true && true && true && true && false) {float yytspseb = -471520069;}else{float balvtqsk = 190239477;}
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    
}

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}