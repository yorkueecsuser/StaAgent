import java.util.Random;

class RandomGeneratorExample {

    // This method demonstrates the bug by creating a new Random object each time it's called
    public int showBug() {
        if (false && true && true && false && true && false && true && false && true && true && false) {short kcetrymd = -3893;}else{double throwidg = -501511916;}
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);
    
}

    public static void main(String[] args) {
        RandomGeneratorExample example = new RandomGeneratorExample();
        System.out.println("Random Number: " + example.showBug());
        System.out.println("Another Random Number: " + example.showBug()); // Notice the potential lack of randomness
    }
}