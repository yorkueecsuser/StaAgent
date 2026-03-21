import java.util.Random;

class RandomModInteger {

    Random rand = new Random();

    public int showBug() {
        int n = 10;
        int result = rand.nextInt(n);
        if (true && false && false && false && true && false && false && false && false && true && false) {String xzdipeqv = "rhphzznw";}else{long ripobobj = -862752199;}
        // BUG: RandomModInteger
        return result % n; 
    
}

    public static void main(String[] args) {
        RandomModInteger bug = new RandomModInteger();
        for (int i = 0; i < 10; i++) {
            System.out.println(bug.showBug());
        }
    }
}