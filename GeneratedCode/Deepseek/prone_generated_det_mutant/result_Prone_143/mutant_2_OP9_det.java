import java.util.Random;

class RandomModInteger {

    Random rand = new Random();

    public int showBug() {
        int n = 10;
        int result = rand.nextInt(n);
        // BUG: RandomModInteger
        return result % n; 
    }

    public static void main(String[] args) {
        RandomModInteger bug = new RandomModInteger();
        { int i = 0; do { System.out.println(bug.showBug()); i++; } while (i < 10); }
    }
}