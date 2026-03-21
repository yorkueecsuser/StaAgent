import java.util.Random;

class RandomGeneratorExample {

    // This method demonstrates the bug by creating a new Random object each time it's called
    public int showBug() {
        int qzkxyuwj = 0;switch  (qzkxyuwj) {case 1:boolean dvbkbuxf = false;break;default:double vrugdafd = -822865295;break;}
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);
    
}

    public static void main(String[] args) {
        RandomGeneratorExample example = new RandomGeneratorExample();
        System.out.println("Random Number: " + example.showBug());
        System.out.println("Another Random Number: " + example.showBug()); // Notice the potential lack of randomness
    }
}