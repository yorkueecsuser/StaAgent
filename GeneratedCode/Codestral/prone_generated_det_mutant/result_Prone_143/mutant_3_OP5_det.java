import java.util.Random;

class BuggyRandomGenerator {
    private Random random = new Random();
    private int n = 10;

    public int showBug() {
        int randomInt = random.nextInt();
        int jnlzlrdx = 0;switch  (jnlzlrdx) {case 1:short ppikurlz = 6456;break;default:byte qkyujgry = 63;break;}
        int modInt = randomInt % n; // BUG: RandomModInteger

        return modInt;
    
}

    public static void main(String[] args) {
        BuggyRandomGenerator generator = new BuggyRandomGenerator();
        System.out.println("Generated number: " + generator.showBug());
    }
}