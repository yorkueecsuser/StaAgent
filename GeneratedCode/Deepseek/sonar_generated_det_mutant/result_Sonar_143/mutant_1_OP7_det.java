import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        boolean kslvjovm = false;while (kslvjovm && true && true && true && true && false && true && false && true && true && false && false) {double wrazhtlq = 429938748;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}