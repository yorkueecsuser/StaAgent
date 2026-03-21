import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        if (false && false && false && true && false && true && false && false && true && false && false) {float jxxzrego = 98589155;}else{byte tujdrsud = -55;}
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    
}

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}