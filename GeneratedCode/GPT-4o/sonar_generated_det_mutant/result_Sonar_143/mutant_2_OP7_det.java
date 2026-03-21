import java.util.Random;

class RandomGeneratorExample {

    // This method demonstrates the bug by creating a new Random object each time it's called
    public int showBug() {
        boolean antlnhpv = false;while (antlnhpv && false && true && true && true && true && false && false && true && true && false && false) {short gqsogoey = 8280;}
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);
    
}

    public static void main(String[] args) {
        RandomGeneratorExample example = new RandomGeneratorExample();
        System.out.println("Random Number: " + example.showBug());
        System.out.println("Another Random Number: " + example.showBug()); // Notice the potential lack of randomness
    }
}