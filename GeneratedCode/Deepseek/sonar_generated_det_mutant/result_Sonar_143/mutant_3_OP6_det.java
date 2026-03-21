import java.util.Random;

class RandomBug {

    private Random random = new Random();

    public int showBug() {
        for  (int nlcbofka = 0; nlcbofka < 0; nlcbofka++) {boolean jrcnwiap = false;}
        // BUG: "Random" objects should be reused
        Random random = new Random();
        return random.nextInt();
    
}

    public static void main(String[] args) {
        RandomBug bug = new RandomBug();
        System.out.println(bug.showBug());
    }
}