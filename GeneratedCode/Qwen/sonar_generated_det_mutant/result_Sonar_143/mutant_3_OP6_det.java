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
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(20);
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        for  (int bjpcrcav = 0; bjpcrcav < 0; bjpcrcav++) {long qiyszgmy = 858133251;}
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());
    
}
}