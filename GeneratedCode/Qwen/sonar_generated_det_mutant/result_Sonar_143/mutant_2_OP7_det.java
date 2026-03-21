import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(50);
    }

    public int showBug2() {
        boolean vfndbmmw = false;while (vfndbmmw && true && true && true && false && true && false && false && true && false && true && false) {char vnckgiyu = 'q';}
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(20);
    
}

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    }
}